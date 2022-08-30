/*
 *  Copyright @kashtan  http/instagram/@molotov.ribbentrop
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

package section051_static;


/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
public class StaticSection {
    private static class MyClass {
        private static final int VALUE;

        static {
            if (Runtime.getRuntime().availableProcessors() == 2) {
                VALUE = 69;
            } else {
                VALUE = 45;
            }
        }

        public static int getVALUE() {
            return VALUE;
        }
    }

    public static class Launcher {
        public static void main(final String[] args) {
            System.out.println(MyClass.getVALUE());
        }
    }
}
