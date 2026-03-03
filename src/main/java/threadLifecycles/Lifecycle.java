package threadLifecycles;

public class Lifecycle implements Runnable{

    @Override
    public void run() {
        System.out.printf("%s is the thread running \n" ,Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.printf("%s is the thread running \n",Thread.currentThread().getName());
        Lifecycle a  = new Lifecycle();
        Thread t1 = new Thread(a,"new Thread");
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(t1.getState());

        t1.join();

        System.out.println(t1.getState());

    }
}
