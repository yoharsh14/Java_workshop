package multithreading.Locks;

import javax.swing.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {
    private final Lock lock = new ReentrantLock();

    public void outer(){
        lock.lock();
        try{
            System.out.println("outer method");
            inner();
        }finally {
            lock.unlock();
        }
    }
    public void inner(){
        lock.lock();
        try{
            System.out.println("Inner method ");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantExample example = new ReentrantExample();
        example.outer();
    }
}
