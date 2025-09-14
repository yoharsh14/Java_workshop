package multithreading;

public class MainThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println("World");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MainThread t1 = new MainThread();
        System.out.println(t1.getName()+" "+t1.getState());
        t1.start();
        System.out.println(t1.getName()+" "+t1.getState());
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
        System.out.println(t1.getName()+" "+t1.getState());
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
    }
}
