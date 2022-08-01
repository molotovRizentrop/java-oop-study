/*
 * Copyright 2022. http://dev.kashtan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package structures;

/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
public class Linked {

    private Item first;

    private Item last;
    int count;

    public void add(int value) {
        Item item = new Item(value);
        if (first == null) {
            first = last = item;
        } else {
            last.next = item;
            last = item;
        }
        count++;
    }

    public int[] toArray() {
        DynaArray dynaArray = new DynaArray();
        Item current = first;
        while (current != null) {
            dynaArray.add(current.value);
            current = current.next;
        }
        return dynaArray.toArray();
    }

    public String asString() {
        StringBuilder builder = new StringBuilder().append('[');
        Item current = first;
        while (current != null) {
            builder.append(current.value);
            if (current.next != null) {
                builder.append(", ");
            }
            current = current.next;
        }
        return builder.append(']').toString();
    }

    public void clear() {
        first = null;
        last = null;
        count = 0;
    }

    public boolean remove(int value) {
        Pair pair = findPair(value);
        if (pair != null) {
            if (pair.current == first) {
                first = first.next;
            } else {
                pair.previous.next = pair.current.next;
                if (pair.current == last) {
                    last = pair.previous;
                }
            }
            count--;
            return true;
        }
        return false;
    }

    private Pair findPair(int value) {
        Item current = first;
        Item previous = first;
        Pair pair = new Pair(current,previous);
        while (pair.current != null) {
            if (pair.current.value == value) {
                return pair;
            }
            pair.previous = pair.current;
            pair.current = pair.current.next;
        }
        return null;
    }

    public boolean contains(int value) {
        return findPair(value) != null ? true : false;
    }


    private class Pair {
        private Item current;
        private Item previous;

        private Pair(Item current, Item previous) {
            this.current = current;
            this.previous = previous;
        }
    }


    private static class Item {

        private int value;

        private Item next;

        private Item(int value) {
            this.value = value;
        }
    }


}