import java.util.concurrent.ThreadLocalRandom;

public class multiTable {

    public static void main(String []args){
        for(int i=1;i<=3;i++) {
            Runnable runnable = new myThread(i);
            Thread thread = new Thread(runnable);
            thread.setName("Thread-"+(i-1));

            thread.start();
        }
    }
}

class myThread implements Runnable {
    private int threadNo;

    myThread(int threadNo){
        this.threadNo = threadNo;
    }

    public void run(){
        for(int i=1;i<=3;i++){
            ///System.out.println(ThreadLocalRandom.current().nextInt(5000, 10000));
            System.out.println(Thread.currentThread().getName()+": "+threadNo+" * "+i+" = "+(threadNo*i));
        }
    }
}