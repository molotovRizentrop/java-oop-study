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

package section071_class_types;

/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
public class OuterWithNotStaticInner {
    private static int static_value = 1;
    private int value = 2;

    private static void staticMethod() {
    }

    private void method() {
        Inner inner = new Inner();
    }

    class Inner {
        void m() {
            static_value = 5;
            value = 7;
            staticMethod();
            method();
        }
    }

    public static void main(final String[] args) {
        OuterWithNotStaticInner outerWithNotStaticInner = new OuterWithNotStaticInner();
        //OuterWithNotStaticInner.Inner t = outerWithNotStaticInner. new Inner();
        Inner inner = outerWithNotStaticInner.new Inner();
        inner.m();
    }
}
