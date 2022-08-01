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

package structuresStackAndLinkedLinkMy;

/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
public class StackBasedOnArrayMy extends BasedOnArrayDataStorageMy {

    public StackBasedOnArrayMy(int size) {
        super(size);
    }

    public StackBasedOnArrayMy() {
        super(5);
    }


    protected int getValueIfNotEmpty() {
        int element = result[size - 1];
        System.arraycopy(result, 0, result, 0, size - 1);
        size--;
        return element;
    }

}
