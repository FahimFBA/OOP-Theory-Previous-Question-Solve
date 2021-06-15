class Inventory {
    int a, b, c, d ;
    Inventory() {
        a= 100 ;
        b = 100 ;
        c = 100 ;
        d = 100 ;
    }

    void soldItem (String model) throws RunningOutException{
        if (model.equals("F")) a-- ;
        else if (model.equals("R")) b-- ;
        else if (model.equals("Ft")) c-- ;
        else if (model.equals("Rt")) d-- ;

        if (a < 30) {
            a = 100 ;
            throw new RunningOutException("Arsenal running dry") ;

        }
        else if (b < 40) {
            b = 100 ;
            throw new RunningOutException("Arsenal running dry") ;

        }
        else if (c < 34) {
            c = 100 ;

            throw new RunningOutException("Arsenal running dry") ;

        }
        else if (d < 50) {
            d = 100 ;
            throw new RunningOutException("Arsenal running dry") ;

        }

    }

}

class RunningOutException extends Exception {
    RunningOutException(String message) {
        super(message) ;
    }
}
public class Main
{
    public static void main (String[] args) {
        Inventory i = new Inventory() ;
        try {
            for (int j=100; j>=0; j--) {
                i.soldItem("R") ;
                System.out.println(i.b) ;
            }
        }catch (RunningOutException e) {
            System.out.println(e.getMessage());
        }
    }

}