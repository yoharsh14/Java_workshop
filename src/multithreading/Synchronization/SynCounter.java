package multithreading.Synchronization;

public class SynCounter {
    private int count = 0;

//         public synchronized void increment() {
//             this.count += 1;
//         }

    public void increment() {
        synchronized (this) {
            count += 1;
        }
    }

    public int getCount() {
        return count;
    }
}
