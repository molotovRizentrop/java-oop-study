/*
 *
 *  Copyright (c) 2023. @kashtan @email:bassanduub.co@gmail.com
 *
 *  The Java Study Project licenses this file to you under the Apache License,
 *  version 2.0 (the "License"); you may not use this file except in compliance
 *  with the License. You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package section091_exeption_usage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
public class ExceptionConversion {
    public static void main(final String[] args) {
        final ConfigProvider provider = new FileConfigProvider();
        int configValue;
        try {
            configValue = provider.getConfigValue();
        } catch (IOException exception) {
            System.err.println("Can't read config value from privider " + provider.getClass() + ": " + exception);
            configValue = 666;
        }
        System.out.println(configValue);
    }

    public interface ConfigProvider {
        int getConfigValue() throws IOException;
    }

    private static class FileConfigProvider implements ConfigProvider {
        @Override
        public int getConfigValue() throws IOException {
            return Integer.parseInt(Files.readString(Paths.get(System.getProperty("user.home") + "/config-file.txt")));
        }
    }
}
