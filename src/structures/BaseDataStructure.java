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

package structures;

/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
public abstract class BaseDataStructure implements DataStructure {
    protected int count;

    @Override
    public void add(int[] array) {
        for (int value : array) {
            add(value);
        }
    }

    @Override
    public void add(DynaArray dynaArray) {
        add(dynaArray.toArray());
    }

    @Override
    public void add(LinkedList list) {
        add(list.toArray());
    }

    @Override
    public final int size() {
        return count;
    }

    @Override
    public void clear() {
        count = 0;
    }
}
