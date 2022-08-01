package section001_classes;

import structures.DynaArray;

/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
public class SolutionMy {
    public static void main(String[] args) {
        int[] array = {1, 2, -2, 0, 3, 5562, 1, 1, 23, '0'};
        DynaArray dynaArray = getPosssitive(array);
    }

    private static DynaArray getPosssitive(int[] array) {
        DynaArray dynaArray = new DynaArray();

        for (int j : array) {
            if (j > 0) {
                int value = j;
                dynaArray.add(value);
            }
        }

        return dynaArray;
    }
}
