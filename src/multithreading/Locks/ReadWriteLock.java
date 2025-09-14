package multithreading.Locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();
    private int count = 0;

    public void increment() {
        writeLock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" is preforming Write operation");
            count++;
        } finally {
            writeLock.unlock();
        }
    }
    // multiple threads can access to resource which is locked by readLock untill no thread is using resource which
    // is locked by writeLock
    public void getCount() {
        readLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " current count: " + count);
        } finally {
            readLock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadWriteLock readWriteLock = new ReadWriteLock();
        Runnable readOperation = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++)
                    readWriteLock.getCount();
            }
        };
        Runnable writeOperation = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++)
                    readWriteLock.increment();
            }
        };
        Thread writeThread1 = new Thread(writeOperation);
        Thread readThread1 = new Thread(readOperation);
        Thread readThread2 = new Thread(readOperation);

        writeThread1.start();
        readThread1.start();
        readThread2.start();

        writeThread1.join();
        Thread.sleep(100);
        readThread1.join();
        Thread.sleep(100);
        readThread2.join();
        System.out.println("final count " + readWriteLock.count);
    }
}
