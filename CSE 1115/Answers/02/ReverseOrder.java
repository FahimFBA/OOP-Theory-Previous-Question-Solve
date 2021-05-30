import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class ReverseOrder {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>() ;
        ArrayList<String> list_reverse = new ArrayList<>() ;
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt")) ;
            BufferedWriter bw = new BufferedWriter(new FileWriter("reverse.txt")) ;
            String line ;

            while ((line = br.readLine()) != null) {
                String[] splt = line.split(" ") ;
                for (int j=0; j<splt.length; j++) {
                    list.add(splt[j]) ;
                    list_reverse.add(splt[splt.length-j-1]) ;
                }
            }

            for (int k=0; k< list_reverse.size(); k++) bw.write(list_reverse.get(k) + " ");

            bw.close();
            br.close();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
