package AdvancedMethods;

public class Priority implements Runnable{

    @Override
    public void run() {
        for(int i = 0;i< 10;i++){
            System.out.println(Thread.currentThread().getName()+"is running at priority - "+Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        Priority p1 = new Priority();
        Priority p2 = new Priority();
        Priority p3 = new Priority();

        Thread t1 = new Thread(p1,"High Priority Thread");
        Thread t2 = new Thread(p2,"Normal Priority Thread");
        Thread t3 = new Thread(p3,"Low Priority Thread");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t3.start();
        t1.start();
        t2.start();
    }
}
