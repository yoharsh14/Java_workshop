package multithreading.Locks;

import java.util.logging.Logger;

public class MyThread {

    public static void main(String[] args) throws InterruptedException {
    Logger logger = Logger.getLogger(MyThread.class.getName());
        BankAccount bankAccount = new BankAccount();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    bankAccount.withdraw(50);
                    if (Thread.currentThread().isInterrupted()) {
                        logger.info(Thread.currentThread().getName() + " is interrupted");
                    }
                } catch (Exception e) {

                }
            }
        };
        Thread t1 = new Thread(runnable, "thread1");
        Thread t2 = new Thread(runnable, "thread2");
        t1.start();
        t2.start();
    }
}
