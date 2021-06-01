interface A{
    void msg1();
}
class B implements A{
    public void msg1(){
        System.out.println("In msg1: B");
    }
    public void msg2(){
        System.out.println("In msg2: B");
    }
}
public class Q3{

    public static void main(String[] args) {
        A ref = new A(){
            public void msg1(){
                System.out.println("In msg1: anonymous class");
            }
        };
        ref.msg1();
        ref.msg2();
    }
}