package lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantDemo {

    private final ReentrantLock lock = new ReentrantLock(true);

    public void criticalWork() {

        try {
            if (lock.tryLock(1, TimeUnit.SECONDS)){
                try {
                    System.out.println(Thread.currentThread().getName() + " - lock acquired");

                    Thread.sleep(2000);

                    System.out.println(Thread.currentThread().getName() + " - releasing lock");

                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    lock.unlock();
                }
            }else {
                System.out.println(Thread.currentThread().getName() + " could NOT acquire lock");
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantDemo r1 = new ReentrantDemo();

        Thread t1 = new Thread(r1::criticalWork, "Thread-1");
        Thread t2 = new Thread(r1::criticalWork, "Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Process completed");
    }
}