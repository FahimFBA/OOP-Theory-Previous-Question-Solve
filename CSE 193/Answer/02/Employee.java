import java.io.*;

public class Employee {
    public int ID;
    public String name;
    public double salary;

    Employee(int a, String b, double c){
        this.ID = a;
        this.name = b;
        this.salary = c;
    }

    public static void main(String[] args) {
        File file = new File("src/" , "employeeDirectory.txt");
        try {
            BufferedReader in = new BufferedReader(new FileReader((file)));
            String str = in.readLine();
            while (str != null){
                System.out.println(str);
                str = in.readLine();
            }
            in.close();
        }catch (FileNotFoundException e){
            System.out.println("File is not found");
        }catch (IOException e){
            System.out.println("Input/Output problem occured");
        }
    }
}
