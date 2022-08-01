package section031_polymorphism;


/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
public class test {
    public static void main(String[] args) {
        int from = 1;
        int to = 9;

        int result = getSum(from, to);

        System.out.println(result);
    }

    private static int getSum(int from, int to) {
        int sum = 0;
        int count = from;

        while (count <= to) {
            if (count % 3 != 0 && count % 5 != 0) {
                sum += count;
            }
            count++;
        }
        return sum;
    }
}

