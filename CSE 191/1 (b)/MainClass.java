class C
{
    static int outer_x = 10;
    static int outer_y = 20;
    private static int outer_private = 30;
    static class D
    {
        void display()
        {
            System.out.println("outer_x = " + outer_x);
            System.out.println("outer_y = " + outer_y);
            System.out.println("outer_private = " + outer_private);
        }
    }
}
public class MainClass
{
    public static void main(String[] args)
    {
        C.D obj = new C.D();
        obj.display();
    }
}