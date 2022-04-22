import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodExamples {
    public static void main(String[] args) {
        Period period = Period.of(10,2,60);
        System.out.println(period);
        System.out.println(period.get(ChronoUnit.MONTHS));
        System.out.println(period.getDays());
        System.out.println(LocalDateTime.of(2020,10, 01, 10, 23).plus(Period.ofDays(2)));
        System.out.println(LocalDateTime.of(2020,10, 01, 10, 23).plus(2, ChronoUnit.DAYS));
    }
}
