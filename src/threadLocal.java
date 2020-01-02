import java.util.concurrent.ThreadLocalRandom;

public class threadLocal {

    public static void main(String []args){
        for(int i=1;i<=3;i++) {
            Runnable runnable = new myThread1(i);
            Thread thread = new Thread(runnable);
            thread.setName("Thread-"+(i-1));

            thread.start();
        }
    }
}

class myThread1 implements Runnable {
    private int threadNo;

    myThread1(int threadNo){
        this.threadNo = threadNo;
    }

    public void run(){
        for(int i=1;i<=4;i++){
            //System.out.println(ThreadLocalRandom.current().nextInt(0, 1500 ));
            System.out.println(Thread.currentThread().getName()+ ": "+threadNo + ThreadLocalRandom.current().nextInt(0,1500));
        }
    }
}