class up extends Thread{
    public void run(){
        for(int i=1; i<=9; i++)
            System.out.println(i+"-up");
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
class down extends Thread{
    public void run(){
        for(int i=9; i>=1; i--)
            System.out.println(i+"--down");
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class FirstThread {
    public static void main(String args[]){
        up t1 = new up();
        down t2 = new down();

        t1.start();
        t2.start();


    }
}
