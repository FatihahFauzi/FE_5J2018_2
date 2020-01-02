public class Testing implements Runnable{

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() +" 1 is running . . .");

    }//class void run

    public static void main(String args[]){
        System.out.println(Thread.currentThread() + " 2 is running...");
        Thread t1 = new Thread(new Testing(), "3 stiw3054");
        Thread t2 = new Thread(new Testing());
        t2.start();
        t1.start();
        System.out.println(Thread.currentThread().getName() + " 4 is running ...");
        t1.run();
        t2.run();
        System.out.println(t2.getName() + "  5 is stopping . . .");

    }//main class
}//class Testing
