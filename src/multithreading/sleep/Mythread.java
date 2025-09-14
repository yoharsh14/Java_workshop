package multithreading.sleep;

public class Mythread extends Thread {

    public Mythread(String name) {
        Thread.currentThread().setName(name);
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            for(int i=0;i<1000;i++){
            System.out.println("hello");

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Mythread t1 = new Mythread("first");
        Mythread t2 = new Mythread("Second");
        t1.start();
        Thread.sleep(1000);
        t2.start();
    }
}
