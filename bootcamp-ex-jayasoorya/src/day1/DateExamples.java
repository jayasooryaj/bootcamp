package day1;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Date;

public class DateExamples {
    public static void main(String arg[]){
        Date currentDate = new Date();
        LocalDateTime currentLocalDate = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MM, YYYY");

        System.out.println(currentDate);
        System.out.println(currentLocalDate);
        System.out.println(dateFormatter.format(currentLocalDate));
        System.out.println(dateFormatter.format(currentLocalDate.plusDays(5)));
        System.out.println(dateFormatter.format(currentLocalDate.minusDays(5)));


    }
}
