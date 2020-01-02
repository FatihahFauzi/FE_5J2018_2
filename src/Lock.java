import java.util.concurrent.locks.ReentrantLock;

public class Lock {
    static int number1=0;
    public static ReentrantLock lock = new ReentrantLock();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Thread t1 = new threadA();
        Thread t2 = new threadB();
        Thread t3 = new threadC();
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }

    static class threadA extends Thread{
        public void run(){
            for (int number = 1; number<=10 ; number++){
                if(number==5 || number ==6||number ==7) {
                    lock.lock();
                    System.out.println("Thread A Lock : "+number);
                    lock.unlock();
                }else{
                    System.out.println("Thread A : "+number);
                }
            }
        }

    }


    static class threadB extends Thread{
        public void run(){
            for (int number = 1; number<=10 ; number++){
                if(number==5 || number ==6||number ==7) {
                    lock.lock();
                    System.out.println("Thread B Lock : "+number);
                    lock.unlock();
                }else{
                    System.out.println("Thread B : "+number);
                }
            }}
    }


    static class threadC extends Thread{
        public void run(){
            for (int number = 1; number<=10 ; number++){
                if(number==5 || number ==6||number ==7) {
                    lock.lock();
                    System.out.println("Thread C Lock : "+number);
                    lock.unlock();
                }else{
                    System.out.println("Thread C : "+number);
                }}
        }

    }
}
