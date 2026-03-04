package lock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RWLockDemo {

    private int value = 0;

    // true = fair lock (prevents writer starvation)
    private final ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock(true);

    public void readValue() {
        rwLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()
                    + " reading value = " + value);

            Thread.sleep(500);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            rwLock.readLock().unlock();
        }
    }

    public void writeValue(int newValue) {
        rwLock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName()
                    + " updating value from " + value + " to " + newValue);

            value = newValue;

            Thread.sleep(1000);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            rwLock.writeLock().unlock();
        }
    }

    public static void main(String[] args) {

        RWLockDemo obj = new RWLockDemo();

        // Create 20 reader threads
        for (int i = 1; i <= 20; i++) {
            Thread reader = new Thread(obj::readValue, "Reader-" + i);
            reader.start();
        }

        // Create 2 writer threads
        Thread writer1 = new Thread(() -> obj.writeValue(100), "Writer-1");
        Thread writer2 = new Thread(() -> obj.writeValue(200), "Writer-2");

        writer1.start();
        writer2.start();
    }
}