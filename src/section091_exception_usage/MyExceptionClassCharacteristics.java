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

package section091_exception_usage;

/**
 * section091_exception_usage.MyException: error message
 * at section091_exception_usage.MyExceptionClassCharacteristics.method2(MyExceptionClassCharacteristics.java:57)
 * at section091_exception_usage.MyExceptionClassCharacteristics.method1(MyExceptionClassCharacteristics.java:53)
 * at section091_exception_usage.MyExceptionClassCharacteristics.main(MyExceptionClassCharacteristics.java:40)
 * Caused by: java.lang.Exception: cause
 * at section091_exception_usage.MyExceptionClassCharacteristics.createCause(MyExceptionClassCharacteristics.java:49)
 * at section091_exception_usage.MyExceptionClassCharacteristics.main(MyExceptionClassCharacteristics.java:25)
 * Suppressed: ...
 *
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 */
public class MyExceptionClassCharacteristics {
    public static void main(final String[] args) {
        final Exception cause = createCause();
        final MyException[] exceptions = {
                MyException.createFull("error message", cause),
                MyException.createWithMessage("error message"),
                MyException.createWithCause(cause),
                MyException.createEmpty(),

                MyException.createFullWithoutStackTrace("error message", cause),
                MyException.createWithMessageAndWithoutStackTrace("error message"),
                MyException.createWithCauseAndWithoutStackTrace(cause),
                MyException.createEmptyWithoutStackTrace()
        };
        for (int i = 0, exceptionsLength = exceptions.length; i < exceptionsLength; i++) {
            final MyException exception = exceptions[i];
            try {
                method1(exception);
            } catch (final MyException ex) {
                System.err.println(i + ") ---------------------------------------");
                ex.printStackTrace();
            }
        }
    }

    private static Exception createCause() {
        return new Exception("cause");
    }

    private static void method1(final MyException exception) {
        method2(exception);
    }

    private static void method2(final MyException exception) {
        throw (MyException) exception.fillInStackTrace();
    }

    /**
     * @author:kashtan
     * @email:bassanddub.co@gmail.com
     */
    public static final class MyException extends RuntimeException {

        private MyException(final String message,
                            final Throwable cause,
                            final boolean enableSuppression,
                            final boolean writableStackTrace) {
            super(message != null ? message : (cause != null ? cause.toString() : null), cause, enableSuppression, writableStackTrace);
        }

        public static MyException createFull(final String message, final Throwable cause) {
            return new MyException(message, cause, true, true);
        }

        public static MyException createWithMessage(final String message) {
            return new MyException(message, null, true, true);
        }

        public static MyException createWithCause(final Throwable cause) {
            return new MyException(null, cause, true, true);
        }

        public static MyException createEmpty() {
            return new MyException(null, null, true, true);
        }

        public static MyException createFullWithoutStackTrace(final String message, final Throwable cause) {
            return new MyException(message, cause, true, false);
        }

        public static MyException createWithMessageAndWithoutStackTrace(final String message) {
            return new MyException(message, null, true, false);
        }

        public static MyException createWithCauseAndWithoutStackTrace(final Throwable cause) {
            return new MyException(null, cause, true, false);
        }

        public static MyException createEmptyWithoutStackTrace() {
            return new MyException(null, null, true, false);
        }
    }
}
