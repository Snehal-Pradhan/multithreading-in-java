package synchronizedWork;

public class myThread implements Runnable{

    private int count = 0;


    public void increment(){
        synchronized (this){
            count++;
        }
        // if not made synchronized - total will not be 1000 + 1000 = 2000

    }

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        for(int i = 0;i<1000;i++){
            increment();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        myThread c = new myThread();
        Thread t1 = new Thread(c,"Thread 1");
        Thread t2 = new Thread(c,"Thread 2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Counter count = "+ c.getCount());
    }
}
