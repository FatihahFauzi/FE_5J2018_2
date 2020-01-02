import java.util.stream.Stream;

public class ConvertString {
    public static void main(String[] args) {
        String s1 = "universiti utara malsysia";
        String s2 = "satu dua tiga";

        String s3 = "satu dua tiga empat";
        String s4 = "one two three four";

        String[] split = s1.split(" ");
        String[] split1 = s2.split(" ");
        String[] split2 = s3.split(" ");
        String[] split3 = s4.split(" ");

        Thread t1 = new Thread(()->{

            for(int i=0;i<Stream.of(split).count();i++){
                System.out.print(split[i]+" ");
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                Thread.yield();
            }
            System.out.println();

            for (int j=0;j<Stream.of(split2).count();j++){
                System.out.print(split2[j]+" ");
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                Thread.yield();
            }
        });

        t1.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread t2 = new Thread(()->{
            for(int k=0; k<Stream.of(split1).count(); k++) {
                System.out.print(split1[k]+" ");
                System.out.println();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Thread.yield();
            }


            for(int l=0; l<Stream.of(split3).count(); l++) {
                System.out.print(split3[l]+" ");
                System.out.println();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Thread.yield();
            }
        });
        t2.start();
    }
}
