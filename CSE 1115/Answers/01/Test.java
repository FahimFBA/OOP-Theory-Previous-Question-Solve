import java.sql.SQLOutput;

abstract class Person {
    public static int count = 0 ;
    public abstract void eat() ;
    public abstract void work() ;
}

class Teacher extends Person {

    Teacher() {
        count++ ;
    }
    @Override
    public void eat() {
        System.out.println("I am eating.");
    }

    @Override
    public void work() {
        System.out.println("I need to prepare lectures and questions.");
    }
}

class Student extends Person {

    Student() {
        count++ ;
    }
    @Override
    public void eat() {
        System.out.println("I am eating.");
    }

    @Override
    public void work() {
        System.out.println("I need to study sincerely.");
    }
}

class Test {
    public static void main(String[] args) {
        Person p = new Teacher() ;
        p.eat();
        p.work();
        Person q = new Teacher() ;
        q.eat();
        q.work();
        Person r = new Student() ;
        r.eat();
        r.work();
        System.out.println("Total objects created: " + Person.count);
    }
}