package lock;

import java.util.concurrent.locks.ReentrantLock;

public class LockInterruptibility {

private final static ReentrantLock lock = new ReentrantLock(true);


static class Worker implements Runnable{
    @Override
    public void run() {


        try {
            System.out.println(Thread.currentThread().getName()+ " trying to acquire lock.");
            lock.lockInterruptibly();

            try {
                System.out.println(Thread.currentThread().getName()+ " acquired lock.");
                Thread.sleep(5000);
            }finally {
                lock.unlock();
                System.out.println(Thread.currentThread().getName() + " released lock");
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted while waiting for lock");
        }
    }
}




static void main(String[] args) {


    Thread t1 = new Thread(new Worker(), "Thread-1");
    Thread t2 = new Thread(new Worker(), "Thread-2");

    t1.start();

    try {
        Thread.sleep(100); // ensure t1 gets the lock
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    t2.start();

    try {
        Thread.sleep(2000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }

    System.out.println("Main thread interrupting Thread-2");
    t2.interrupt();
    }

}
