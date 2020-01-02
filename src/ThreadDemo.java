import com.sun.jdi.IntegerValue;

public class ThreadDemo
{
    public static void main(String[] args)
    {
        Runnable r = new Runnable()
        {
            @Override
            public void run()
            {
                String name = Thread.currentThread().getName();
                int count = 0;
                while (!Thread.interrupted())
                    System.out.println(name + ": " + count++);
            }
        };
        Thread thdA = new Thread(r);
        Thread thdB = new Thread(r);
        thdA.start();
        thdB.start();
        while (true)
        {
            double n = Math.random();
            if (n >= 1 && n <=1500)
                break;
        }
        thdA.interrupt();
        thdB.interrupt();
    }
}