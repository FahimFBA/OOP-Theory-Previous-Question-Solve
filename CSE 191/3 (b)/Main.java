import java.util.ArrayList;
import java.util.Comparator;

class St
{
    float cgpa;
    String name;

    public St(float cgpa, String name)
    {
        this.cgpa = cgpa;
        this.name = name;
    }

    public String toString()
    {
        return this.cgpa + " " + this.name;
    }
}
class Main
{
    public static void main (String[] args)
    {
        ArrayList<St> students = new
                ArrayList<St>();
        students.add(new St((float) 3.44, "Afnan"));
        students.add(new St((float) 2.1, "Ullash"));
        students.sort(new Comparator<St>() {
            @Override
            public int compare(St o1, St o2) {
                // id wise ascending sort
                if (o1.cgpa < o2.cgpa) return -1;
                else if (o1.cgpa > o2.cgpa) return 1;
                return 0;
            }

        });
        for (St student : students){
            System.out.println(student.name + " " + student.cgpa );
        }
        students.sort(new Comparator<St>() {
            @Override
            public int compare(St o1, St o2) {


                // name wise ascending sort
                return o2.name.compareTo(o1.name);
            }

        });


        for (St student : students){
            System.out.println(student.name + " " + student.cgpa );
        }
    }

}