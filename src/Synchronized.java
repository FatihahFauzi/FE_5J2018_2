public class Synchronized
{

    public static void MyThread() throws InterruptedException
    {
        Thread t1 = new Thread()
        {
            public void run()
            {
                for (int i = 1; i <= 10; i++)
                {
                    synchronized (this)
                    {
                        switch (i)
                        {
                            case 5:
                            case 7:
                            case 6:
                                System.out.print("Lock ");
                                break;
                        }
                    }
                    System.out.println(i);
                }
            }
        };

        Thread t2 = new Thread()
        {
            public void run()
            {
                for (int i = 1; i <= 10; i++)
                {
                    synchronized (this)
                    {

                        switch (i)
                        {
                            case 5:
                            case 7:
                            case 6:
                                System.out.print("Lock ");
                                break;
                        }
                    }
                    System.out.println(i);
                }
            }
        };

        Thread t3 = new Thread()
        {
            public void run()
            {
                for (int i = 1; i <= 10; i++)
                {
                    synchronized (this)
                    {
                        switch (i)
                        {
                            case 5:
                            case 7:
                            case 6:
                                System.out.print("Lock ");
                                break;
                        }
                    }
                    System.out.println(i);
                }
            }
        };

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
    }
    public static void main(String[] args) throws InterruptedException
    {
        MyThread();
    }
}