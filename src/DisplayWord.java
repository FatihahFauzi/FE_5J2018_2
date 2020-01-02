public class DisplayWord extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("universiti utara malaysia sintok kedah malaysia");
            sleep(1000);


        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        try
        {
            String s1 = "universiti";
            char[] c = s1.toCharArray();
            System.out.println("universiti");
            for(int i=1;i<=9;i++)
            {
                System.out.println(c[i]);
                sleep(500);
            }

            System.out.println();

            System.out.println("utara");
            String s2 = "utara";
            char[] c1 = s2.toCharArray();
            for (int j=1;j<=4;j++){
                System.out.println(c1[j]);
                sleep(500);
            }

            System.out.println();

            System.out.println("malaysia");
            String s3 = "malaysia";
            char[] c2 = s3.toCharArray();
            for (int k=1;k<=7;k++){
                System.out.println(c2[k]);
                sleep(500);
            }

            System.out.println();

            System.out.println("sintok");
            String s4 = "sintok";
            char[] c3 = s4.toCharArray();
            for (int l=1;l<=5;l++){
                System.out.println(c3[l]);
                sleep(500);
            }

            System.out.println();

            System.out.println("kedah");
            String s5 = "kedah";
            char[] c4 = s5.toCharArray();
            for (int m=1;m<=4;m++){
                System.out.println(c4[m]);
                sleep(500);
            }

            System.out.println();

            System.out.println("malaysia");
            String s6 = "malaysia";
            char[] c5 = s6.toCharArray();
            for (int n=1;n<=7;n++){
                System.out.println(c5[n]);
                sleep(500);
            }


        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}



class Issue3
{
    public static void main(String args[])
    {
        DisplayWord t1=new DisplayWord();
        Thread2 t2=new Thread2();

        t1.start();
        t2.start();
    }

}