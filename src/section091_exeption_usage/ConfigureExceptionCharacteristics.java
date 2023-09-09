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

/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
public class ConfigureExceptionCharacteristics {

    /**
     * @author:kashtan
     * @email:bassanddub.co@gmail.com
     **/
    public static final class Ex0 extends RuntimeException {

        /**
         * section091_exeption_usage.Ex0
         * at section091_exeption_usage.Test.method2(Test.java:34)
         * at section091_exeption_usage.Test.method1(Test.java:30)
         * at section091_exeption_usage.Test.main(Test.java:26)
         */
        public Ex0() {
        }
    }

    /**
     * @author:kashtan
     * @email:bassanddub.co@gmail.com
     **/
    public static final class Ex1 extends RuntimeException {

        /**
         * section091_exeption_usage.Ex1: Error message
         * at section091_exeption_usage.Test.method2(Test.java:34)
         * at section091_exeption_usage.Test.method1(Test.java:30)
         * at section091_exeption_usage.Test.main(Test.java:26)
         */
        public Ex1(final String message) {
            super(message);
        }
    }

    /**
     * @author:kashtan
     * @email:bassanddub.co@gmail.com
     **/
    public static final class Ex2 extends RuntimeException {

        /**
         * section091_exeption_usage.Ex2: Error message
         * at section091_exeption_usage.Test.method2(Test.java:34)
         * at section091_exeption_usage.Test.method1(Test.java:30)
         * at section091_exeption_usage.Test.main(Test.java:26)
         * Caused by: java.lang.Exception: cause
         * at section091_exeption_usage.Test.createCause(Test.java:49)
         * at section091_exeption_usage.Test.main(Test.java:25)
         */
        public Ex2(final String message,
                   final Throwable cause) {
            super(message, cause);
        }

        /**
         * section091_exeption_usage.Ex2: java.lang.Exception: cause
         * at section091_exeption_usage.Test.method2(Test.java:34)
         * at section091_exeption_usage.Test.method1(Test.java:30)
         * at section091_exeption_usage.Test.main(Test.java:26)
         * Caused by: java.lang.Exception: cause
         * at section091_exeption_usage.Test.createCause(Test.java:49)
         * at section091_exeption_usage.Test.main(Test.java:25)
         */
        public Ex2(final Throwable cause) {
            super(cause);
        }
    }

    /**
     * @author:kashtan
     * @email:bassanddub.co@gmail.com
     **/
    public static final class Ex3 extends RuntimeException {

        /**
         * section091_exeption_usage.Ex3: Error message
         */
        public Ex3(final String message) {
            super(message, null, true, false);
        }
    }
}
