import java.util.Random;
public class parallelSum{
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Random objGenerator = new Random();
        for (int iCount = 0; iCount< 10; iCount++){
            int randomNumber = objGenerator.nextInt(100);
            System.out.println("Random No : " + randomNumber);
        }

        long endTime = System.currentTimeMillis();
        long timeElapsed = endTime - startTime;
        System.out.println("\nExecution time in milliseconds: " + timeElapsed);
    }
}



