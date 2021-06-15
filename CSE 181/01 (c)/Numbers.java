import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        try{
            File f = new File("src/","Input.txt");
            Scanner sc = new Scanner(f);

            while(sc.hasNext()){
                int sum=0;
                String line = sc.nextLine();
                String[] parts = line.split(",");
                for(int i=0; i< parts.length; i++){
                    sum=sum+(Integer.parseInt(parts[i]));
                    //max= max>(Integer.parseInt(parts[i])) ? max:(Integer.parseInt(parts[i]));

                }
                System.out.println(sum);
            }

            sc.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}