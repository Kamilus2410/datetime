import java.time.*;
import java.time.temporal.ChronoUnit;

public class Durations { //taki period ale dla czasu zegarowego a nie kalendarza
    public static void main(String[] args) {
        System.out.println(Duration.ofDays(1));
        System.out.println(Duration.ofDays(1000)); //nie zamieni na dni
        Duration durationx = Duration.ofDays(1);
        System.out.println(durationx.withSeconds(600)); //nie da sie dopisac sekund do dni
        System.out.println(Duration.ofMinutes(1450)); //trzeba tak
        System.out.println(Duration.of(1, ChronoUnit.DAYS));
        System.out.println();

        Duration duration = Duration.ofDays(1);
        Period period = Period.ofDays(1);

        System.out.println(LocalDate.now().plus(period));
//        System.out.println(LocalDate.now().plus(duration)); nie da sie
//        System.out.println(LocalTime.now().plus(period)); nie da sie
        System.out.println(LocalTime.now().plus(duration));
        System.out.println(LocalDateTime.now().plus(period));
        System.out.println(LocalDateTime.now().plus(duration));


    }
}
