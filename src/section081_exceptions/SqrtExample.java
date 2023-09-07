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

import java.util.Scanner;

/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
public class SqrtExample {
    public static void main(final String[] args) {
        final double number = new Scanner(System.in).nextDouble();
        if (number >= 0){
            System.out.println(Math.sqrt(number));
            System.exit(0);
        }else {
            System.err.println("Number must be possitive!");
            System.exit(-1);
        }
    }
}
