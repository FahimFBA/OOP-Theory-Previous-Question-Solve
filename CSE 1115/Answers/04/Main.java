public class Main {
    public static void main(String[] args) {
        int v1 = 4;
        int v2 = -2;
        try {
            try {
                test(v1);
                return;
            }catch (ArithmeticException e){
                System.out.println("Inner catch: " + e.getMessage());
                test(v2);
            }finally {
                System.out.println("I don't care about exceptions");
            }
        }catch (Exception e){
            System.out.println("Outer catch: " + e.getMessage());
        }
    }
    static void test(int a){
        testException(a);
        return;
    }
    static void testException(int a){
        if(a < 0){
            throw new NumberFormatException("Negative value not allowed");
        }else if (a % 2 == 0){
            throw new ArithmeticException("Even integer found");
        }else {
            System.out.println("Input " + a);
        }
    }
}

/*
Output:
Inner catch: Even integer found
I don't care about exceptions
Outer catch: Negative value not allowed
 */
