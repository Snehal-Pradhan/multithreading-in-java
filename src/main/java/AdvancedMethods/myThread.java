package AdvancedMethods;

public class myThread implements Runnable{


    @Override
    public void run() {
        for (int i = 0 ;i< 10 ;i++){
            System.out.println(Thread.currentThread().getName()+" is running");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        myThread m1 = new myThread();
        Thread t1 = new Thread(m1);
            t1.start();
            for(int i = 0;i<10;i++){
                System.out.println(Thread.currentThread().getName() + " is running");
                Thread.yield();
            }
            // interleaved print statements
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
