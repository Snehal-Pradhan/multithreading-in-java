package lock;

public class intrinsicLock implements Runnable {

    private int counter = 0;

    public void increment(){
        counter++;
    }
    public int getCounter() {
        return counter;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ " is running");
        for(int i = 0; i < 10000;i++){
            synchronized (this){
                increment();
            }

        }
    }

    static void main(String[] args) throws InterruptedException {
        intrinsicLock L1 = new intrinsicLock();
        Thread t1 = new Thread(L1,"Thread-1");
        Thread t2 = new Thread(L1,"Thread-2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(Thread.currentThread().getName() + " execution is completed. Counter : "+L1.getCounter());
    }
}
