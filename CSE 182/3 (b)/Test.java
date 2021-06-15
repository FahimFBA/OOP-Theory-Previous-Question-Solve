abstract class Animal{
    public abstract void makeSound();
}

class Bird extends Animal{
    public void makeSound() {

    }
}

public class Test {

    public static void main(String[] args) {
        Bird obj = new Bird(){
            @Override
            public void makeSound() {
                System.out.println("Chirp");
            }
        };
       obj.makeSound();

    }
}
