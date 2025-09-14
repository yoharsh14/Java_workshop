package multithreading.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class BankAccount {
    Logger logger = Logger.getLogger(getClass().getName());
    private int balance = 100;
    private Lock lock = new ReentrantLock();

    public void withdraw(int amount) {
        logger.info(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try {
//            if(lock.tryLock()){
            if (lock.tryLock(2000, TimeUnit.MILLISECONDS)) {
                if (amount <= balance) {
                    try {
                        logger.info(Thread.currentThread().getName() + " is pending with the withdrawal of amount " + amount);
                        Thread.sleep(1000);
                        balance -= amount;
                        logger.info(Thread.currentThread().getName() + " completed the withdrawal.");
                    } catch (Exception ignored) {
                        Thread.currentThread().interrupt();
                    } finally {
                        lock.unlock();
                    }
                } else {
                    logger.info(Thread.currentThread().getName() + " insufficient balance");
                }
            } else {
//                Thread.currentThread().interrupt();
                logger.info(Thread.currentThread().getName() + " could not acquire the lock");
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }

}
