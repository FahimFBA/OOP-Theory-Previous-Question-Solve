import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        ArrayList<Employee> students1 = new ArrayList<>(); // creating ArrayList
        try {
            File f = new File("src/", "employeeDirectory.txt");
            Scanner sc = new Scanner(f);

            ArrayList<Employee> employees = new ArrayList<>();

            int i = 0;

            int ID;
            String name;
            double salary;

            while (sc.hasNext()) {

                ID = sc.nextInt();
                name = sc.next();
                salary = sc.nextDouble();

                Employee s = new Employee(ID, name, salary);
                employees.add(s);


            }
            employees.sort(new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    if (o1.salary < o2.salary) return 1;
                    else if (o1.salary > o2.salary) return -1;
                    return 0;
                }
            });


            for (int j = 0; j < 1; j++) {
                System.out.println(employees.get(j).ID + " " + employees.get(j).name + " " + employees.get(j).salary);
            }

            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Employee {
    int ID;
    String name;
    double salary;

    Employee(int a, String b, double c) {
        this.ID = a;
        this.name = b;
        this.salary = c;
    }
}

/*
In employeeDirectory.txt

100 Karim 10030
200 Rahim 50200
500 Mina 6500
1000 Sajib 11000
201 Rina 50000
 */