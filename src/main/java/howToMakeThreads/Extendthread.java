package howToMakeThreads;

public class Extendthread extends Thread {

    public Extendthread(String name){
        this.setName(name);
    }
    @Override
    public void run() {
        System.out.printf("%s is the running Thread.\n",this.getName());
    }
}

