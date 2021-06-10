public class Book{
    static class Cover{
        public void foo(){
            System.out.println(" Inside foo" );
        }

        public void bar() {
        }
    }
    void bar(){
        System.out.println(" Inside bar" );
    }
    public static void main(String args []){
        Cover a= new Cover();
        a.foo();
        a.bar();
    }
}