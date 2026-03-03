import class2.Extendthread;
import class2.ImplementRunnable;

public class Test {
public static void main(String[] args){
    System.out.println("I am learning Multithreading in Java!!!");
    System.out.println(Thread.currentThread().getName());

    Extendthread t2 = new Extendthread("World");
    t2.start();

    ImplementRunnable R1 = new ImplementRunnable();
    Thread t1 = new Thread(R1,"Hello");
    t1.start();
}

}
