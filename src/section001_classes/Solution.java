package section001_classes;

import structures.DynaArray;

/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
public class Solution {
    public static void main(String[] args) {
        DynaArray dynaArray = new DynaArray();

        dynaArray.add(0);
        dynaArray.add(1);
        dynaArray.add(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10});

        System.out.println(dynaArray.toString());
    }

    private static DynaArray getPositiveNumbers(int[] array) {
        int[] result = new int[array.length];
        int count = 0;
        for (int value : array) {
            if (value > 0) {
                result[count++] = value;
            }
        }
        DynaArray dynaArray = new DynaArray();

        return dynaArray;
    }
}