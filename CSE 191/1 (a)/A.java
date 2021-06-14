abstract class A {
    public void printSum(int a, int b) {
        System.out.println(a + b);
    }
    public abstract void printSum(int a, int b, int c);
    public abstract void printSum(int a, int b, int c, int d);

    A objA = new A() {
        @Override
        public void printSum(int a, int b, int c) {

        }

        @Override
        public void printSum(int a, int b, int c, int d) {

        }
    };
}
