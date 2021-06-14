import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main (String[] args) {
        try {
            BufferedReader read = new BufferedReader(new FileReader("Input.txt"));
            String line ;
            while ((line = read.readLine())!= null) {
                String split[] = line.split(",") ;
                int arr[] = new int[100] ;
                for (int i=0; i<split.length; i++) {
                    arr[i] = Integer.parseInt(split[i]) ;
                }
                System.out.println(getMax(arr)) ;
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }


static int getMax(int arr[]) {
        int max = arr[0] ;
        for (int i=1; i<arr.length; i++ ) {
            if (max < arr[i] ) {
                max = arr[i] ;
            }
        }
        return max ;
    }
}