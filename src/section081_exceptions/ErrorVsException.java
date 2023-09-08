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

package section081_exceptions;

import java.util.ServiceLoader;

/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
public class ErrorVsException {
    public static void main(final String[] args) {
        final Test test = ServiceLoader.load(Test.class).findFirst().orElseThrow();

        try {
            test.doSomething();
        }
        // there is no point in catching the ERROR exception
        // catch (Error error) {
        //    error.printStackTrace();
        // }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /**
     * @author:kashtan
     * @email:bassanddub.co@gmail.com
     **/
    public interface Test {

        void doSomething() throws Exception;
    }

    /**
     * @author:kashtan
     * @email:bassanddub.co@gmail.com
     **/
    public static final class TestIml implements Test {

        @Override
        public void doSomething() throws Exception {
            final int[] ints = new int[Integer.MAX_VALUE];
            throw new OutOfMemoryError("");
        }
    }
}
