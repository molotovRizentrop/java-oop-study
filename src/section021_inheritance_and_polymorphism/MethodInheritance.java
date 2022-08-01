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

package section021_inheritance_and_polymorphism;

/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 */

import structures.DynaArray;
import structures.LinkedList;

public class MethodInheritance {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray();
        dynaArray.add(2);
        System.out.println(dynaArray.size());
        dynaArray.clear();

        LinkedList list = new LinkedList();
        list.add(2);
        System.out.println(list.size());
        list.clear();
    }
}