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
public class SumCalculator {

    private static long sum(ArrayElementsProvider arrayElementsProvider) {
        long sum = 0;
        while (arrayElementsProvider.hasMoreElements()) {
            sum += arrayElementsProvider.nextElement();
        }
        return sum;
    }

    public static void main(String[] args) {
        //ArrayElementsProvider arrayElementsProvider = new FromRAMArrayElementsProvider(new int[]{1, 2, 3, 4, 5});
        ArrayElementsProvider arrayElementsProvider = new FromClasspathResourceArrayElementsProvider("data.txt");
        System.out.println(sum(arrayElementsProvider));
    }
}