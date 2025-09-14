package multithreading.Locks;

class Pen {
    public synchronized void writeWithPenAndPaper(Paper paper) {
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to access paper");
        paper.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished writting using pen" + this);
    }
}

class Paper {
    public synchronized void writeWithPenAndPaper(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " is using pen " + this + " and trying to access paper");
        pen.finishWriting();
    }

    public synchronized void finishWriting() {
        System.out.println(Thread.currentThread().getName() + " finished writting using pen" + this);
    }
}

class Task1 implements Runnable {
    private Pen pen;
    private Paper paper;

    public Task1(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        /* This is resolving deadlock situation
        synchronized (paper){
        pen.writeWithPenAndPaper(paper);
        }
        */

        // this is creating deadlock situation
        pen.writeWithPenAndPaper(paper);
    }
}

class Task2 implements Runnable {
    private Pen pen;
    private Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        /*
        This is resolving deadlock situation
        first it locks the resource which it should be needing which then only it proceeds
        synchronized (pen){
        paper.writeWithPenAndPaper(pen);
        } */

        // this is a deadlock situtaion
        paper.writeWithPenAndPaper(pen);
    }
}

public class DeadLock {


    public static void main(String[] args) {
        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1= new Thread(new Task1(pen,paper));
        Thread t2= new Thread(new Task2(pen,paper));

        t1.start();
        t2.start();

    }
}
