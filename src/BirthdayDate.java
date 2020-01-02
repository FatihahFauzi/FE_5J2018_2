import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class BirthdayDate {
    //Calendar a is target date , Calendar b is current target which is set today,TimeUnit units desired conversion(minutes)
    public static long toconvert(Calendar a, Calendar b, TimeUnit units) {
        return units.convert(a.getTimeInMillis() - b.getTimeInMillis(), TimeUnit.MILLISECONDS);
        //here we want to convert the given calendar date into time unit (into milliseconds)
    }

    public static void main(String[] args) {
        Calendar bithdate = Calendar.getInstance();//set target date
        bithdate.set(2020, Calendar.MAY, 28,07,00,00);
        Calendar today = Calendar.getInstance();//set current date

        //prints the calculation
        System.out.println("My upcoming birthday is: "+ bithdate.getTime());//returns a Date object representing this Calendar's time value
        System.out.println("Today date is: "+ today.getTime());
        System.out.println(" ");
       // System.out.println("There is "+toconvert(bithdate, today, TimeUnit.DAYS) + " days in between ");//we set here days
        System.out.println("There is "+toconvert(bithdate, today, TimeUnit.MINUTES) + " minutes in between ");//we set here minutes
    }
}