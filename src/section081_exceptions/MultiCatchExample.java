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

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
public class MultiCatchExample {
    public static void main(final String[] args) {
        try {
            doSomething();
        } catch (Exception e) {
             System.err.println(e.toString());
        }
        System.out.println("After doSomething");
    }

    /**
     * @throws InputMismatchException
     * @throws NoSuchElementException
     * @throws IllegalStateException
     * @throws IllegalArgumentException
     * @throws ArithmeticException
     * @throws ClassNotFoundException
     */
    private static void doSomething() throws ClassNotFoundException {
        final int value = new Scanner(System.in).nextInt();
        if (value < 0) {
            throw new IllegalArgumentException("value < 0");
        }
        if (value == 0) {
            throw new ArithmeticException("value = 0");
        }
        if (value == 5) {
            throw new ClassNotFoundException("value = 5");
        }
        System.out.println("OK");
    }

}
