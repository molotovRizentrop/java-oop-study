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
public abstract class BasedOnArrayDataStorageMy extends BasedDataStorageMy {
    protected int[] result;


    public BasedOnArrayDataStorageMy(int size) {

        this.result = new int[size];
    }

    public BasedOnArrayDataStorageMy() {
        this(5);
    }

    @Override
    public void add(int value) {
        if (size == result.length) {
            grow();
        }
        result[size++] = value;
    }

    private void grow() {
        int[] newResult = new int[result.length * 2];
        System.arraycopy(result, 0, newResult, 0, result.length);
        result = newResult;
    }
    @Override
    public int get() {
        if (size != 0) {
            return getValueIfNotEmpty();
        } else { //throw Exception
            return 0;
        }
    }

    protected abstract int getValueIfNotEmpty();


}
