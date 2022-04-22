import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2020, Month.AUGUST, 12));
        System.out.println(LocalDateTime.now());
        System.out.println(Arrays.toString(Month.values()));
        System.out.println(LocalDate.EPOCH);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.NOON);
        System.out.println(LocalTime.MIDNIGHT);
    }
}
