package multithreading.Synchronization;

public class MySyncThread extends Thread {
    private SynCounter synCounter;

    public MySyncThread(SynCounter synCounter) {
        this.synCounter = synCounter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            synCounter.increment();
        }
    }
}
