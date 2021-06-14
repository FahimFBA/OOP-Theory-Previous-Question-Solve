class MyThread implements Runnable{
    String name;
    int n;

    public MyThread(String name) {
        this.name = name;
    }
    public void time(int n){
        this.n = n;
    }
    public void run(){
        System.out.printf("Running:%s %d times.\n", name, n);
    }
}
public class Main{
    public static void main(String[] args) {
        MyThread t = new MyThread("First Thread");
        Thread t1 = new Thread(t);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}