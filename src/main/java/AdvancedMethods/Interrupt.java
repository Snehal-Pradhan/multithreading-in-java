package AdvancedMethods;

public class Interrupt implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" is running.");
        try {
            for(; !Thread.currentThread().isInterrupted(); ){
                System.out.println(Thread.currentThread().getName()+ " is running.");
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("Closing Task");
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + " is running.");
        Interrupt I1 = new Interrupt();
        Thread t1 = new Thread(I1,"BackGround Worker");
        t1.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t1.interrupt();

        t1.join();
        System.out.println("Main worker stopped");

    }

}
