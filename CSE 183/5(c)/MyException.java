import java.util.Scanner;

public class MyException {
    public static void main(String[] args){
        int a[]=new int[5];
        try {
            a[5]=10;
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            Integer.parseInt("abc");
        }catch (Exception e){
            System.out.println(e);
        }

        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
    }
}