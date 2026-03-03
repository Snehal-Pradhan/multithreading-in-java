package howToMakeThreads;

public class ImplementRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Hi");
        System.out.printf("%s is the running thread.\n", Thread.currentThread().getName());
    }
}
