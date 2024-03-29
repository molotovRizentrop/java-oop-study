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
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
public class UseExceptionToResolveAmbiguousCase {
    public static void main(final String[] args) {
        final Mode mode = Mode.valueOf(args[0]);

        if (mode == Mode.A) {
            System.out.println("mode A");
        } else if (mode == Mode.B) {
            System.out.println("mode B");
        } else if (mode == Mode.C) {
            System.out.println("mode C");
        } else if (mode == Mode.D) {
            System.out.println("mode D");
        } else {
            throw new UnsupportedOperationException("Unsupported mode: " + mode);
        }
    }

    public enum Mode {

        A,

        B,

        C,

        D
    }
}
