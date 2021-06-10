import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.IOException;

public class Question {
    public static void main(String[] args) {
        try{
            PrintWriter out=new PrintWriter("AA.txt");
            String str="One,Two,Three,four,five";
            String delimiter=",";
            String[] parts=str.split(delimiter);


            for(int i=0;i< parts.length;i++) {
                out.println(parts[i]);
            }
            out.close();



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}