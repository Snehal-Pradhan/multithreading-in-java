package lock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrancyExample {

    private final ReentrantLock lock = new ReentrantLock();

    public void outerMethod() {
        lock.lock();   // first acquisition
        try {
            System.out.println(Thread.currentThread().getName() +
                    " entered outerMethod. Hold count = " + lock.getHoldCount());

            innerMethod();   // calls another method that uses the same lock

        } finally {
            lock.unlock();
            System.out.println(Thread.currentThread().getName() +
                    " exiting outerMethod. Hold count = " + lock.getHoldCount());
        }
    }

    public void innerMethod() {
        lock.lock();   // same thread acquiring same lock again
        try {
            System.out.println(Thread.currentThread().getName() +
                    " entered innerMethod. Hold count = " + lock.getHoldCount());
        } finally {
            lock.unlock();
            System.out.println(Thread.currentThread().getName() +
                    " exiting innerMethod. Hold count = " + lock.getHoldCount());
        }
    }

    public static void main(String[] args) {
        ReentrancyExample example = new ReentrancyExample();

        Thread t1 = new Thread(example::outerMethod, "Thread-1");
        t1.start();
    }
}