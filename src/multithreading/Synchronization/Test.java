package multithreading.Synchronization;


public class Test {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();
        // we get number less than 2000 because, threads are working parallel
        // so they either work on the object counter together or in situation when t1 is working on it and t2 started
        // working on it.

        // we can introduce synchronization so that if we are working on a variable or object independent of threads
        // so with synchronization only one thread at a time can work on it.
        Thread.sleep(1000);
        System.out.println("Non Synchronized Count ->"+counter.getCount());


        SynCounter synCounter = new SynCounter();
        MySyncThread th1 = new MySyncThread(synCounter);
        MySyncThread th2 = new MySyncThread(synCounter);
        th1.start();
        th2.start();
        Thread.sleep(1000);
        // here you will always get 2000
        // Synchronization ka matlab ek time pe resource ek hi thread use kr sakta ha
        System.out.println("Synchronized Count ->" + synCounter.getCount());
    }
}
