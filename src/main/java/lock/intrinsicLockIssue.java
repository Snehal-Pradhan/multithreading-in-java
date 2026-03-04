package lock;

public class intrinsicLockIssue implements Runnable{

    @Override
    public void run() {
        synchronized (this){
            for (; ; ){
                System.out.println(Thread.currentThread().getName()+ " is running");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }


    static void main(String[] args) {
        intrinsicLockIssue L1 = new intrinsicLockIssue();
        Thread t1 = new Thread(L1,"Thread-1");
        Thread t2 = new Thread(L1,"Thread-2");

        t1.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t2.start();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("t2 state: " + t2.getState());
    }
}
