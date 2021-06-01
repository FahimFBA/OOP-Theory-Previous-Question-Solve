import java.util.Scanner;

public class Q2 {
    private String ID, name;
    Q2(){
        Scanner s = new Scanner(System.in);
        name = s.nextLine();
        ID = s.nextLine();
        Inner inner = new Inner();
        inner.display();
    }
    class Inner{
        public void display(){
            System.out.println("ID is " + ID + " , name is: " + name);
        }
    }

    public static void main(String[] args) {
        Q2 q2 = new Q2();
    }
}
