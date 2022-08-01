package section041_oop;

/**
 * @author:kashtan
 * @email:bassanddub.co@gmail.com
 **/
public class OOP {

    public static void main(String[] args) {
        Class1 class1 = new Class1(new Class2(25));
        class1.doSomething1();
    }

    private interface Interface {

        void doSomething2();
    }

    private static class Class1 {

        private Interface object;

        public Class1(Interface object) {
            this.object = object;
        }

        public void doSomething1() {
            object.doSomething2();
        }
    }

    private static class Class2 implements Interface {

        private int value;

        public Class2(int value) {
            this.value = value;
        }

        @Override
        public void doSomething2() {
            System.out.println(value);
        }
    }
}
