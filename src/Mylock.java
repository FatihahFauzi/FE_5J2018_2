import java .util.concurrent.*;
import java .util.concurrent.locks.ReentrantLock;
import  java.util.concurrent.locks.Lock;

class Exam implements Runnable{
    private int id;
    private static Lock lock = new ReentrantLock();

    public Exam(int id){
        this.id = id;
        lock.lock();
        id++;
        lock.unlock();
    }

    public void run(){
        System.out.println(id +  " starts the ionic . . " );
        try{
            Thread.sleep(2000);

        }catch(InterruptedException e ){
            e.printStackTrace();}
        System.out.println("Thread ID:" + id + " finished . . .");
        try{
            System.out.println("After Cordova. . .");

        } catch ( Exception e){
            e.printStackTrace();
        }
    }
}

public class Mylock {
    public static void main (String[] args){
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        CyclicBarrier barrier = new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {
                System.out.println("The installation failed . . .");

            }
        });
        for(int i= 0; i<3; ++i){
            executorService.execute(new Exam(i + 1));
        }
        System.out.println("The installation succeed . . .");
        executorService.shutdown();
        }
    }

