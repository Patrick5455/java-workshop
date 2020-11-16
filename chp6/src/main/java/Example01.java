import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Example01 {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        DayOfWeek dayOfWeek = localDateTime.getDayOfWeek();


        System.out.println("The Weekday is: "+dayOfWeek);




    }
}
