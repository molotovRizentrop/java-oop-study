/*
 *  Copyright (c) 2022. email:bassanduub.co@gmail.com
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package section031_polymorphism;

/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class FromClasspathResourceArrayElementsProvider implements ArrayElementsProvider {

    private BufferedReader reader;

    private String line;

    public FromClasspathResourceArrayElementsProvider(String resourceName) {
        this.reader = new BufferedReader(
                new InputStreamReader(
                        Objects.requireNonNull(
                                FromClasspathResourceArrayElementsProvider.class.getResourceAsStream(resourceName)
                        )
                )
        );
    }

    @Override
    public boolean hasMoreElements() {
        try {
            line = reader.readLine();
        } catch (IOException e) {
            line = null;
        } finally {
            if (line == null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return line != null;
    }

    @Override
    public int nextElement() {
        return Integer.parseInt(line);
    }
}