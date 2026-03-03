package AdvancedMethods;

public class DaemonThreads implements Runnable{
    @Override
    public void run() {
        for(; ;){
            System.out.println(Thread.currentThread().getName()+ " is running");
        }
    }


    public static void main(String[] args){
        DaemonThreads d1 = new DaemonThreads();
        Thread t1 = new Thread(d1,"Daemon Thread");
        t1.setDaemon(true);

        t1.start();

        System.out.println(Thread.currentThread().getName()+ " is going to stop");

    }
}
