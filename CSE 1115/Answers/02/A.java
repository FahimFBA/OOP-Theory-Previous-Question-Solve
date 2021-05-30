import java.io.*;

public class A {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/fba/Desktop/GitHub Repo/OOP-Theory-Previous-Question-Solve/CSE 1115/Answers/02/" , "data.txt");
        BufferedReader in = new BufferedReader((new FileReader(file)));
        String str = in.readLine();
        while (str != null){
            System.out.println(str);
            str = in.readLine();
        }
        in.close();
    }
}
