import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Instants {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2018, 10, 28);
        LocalTime time1 = LocalTime.of(1,55);
        ZoneId zone1 = ZoneId.of("Europe/Belgrade");
        ZoneId zone2 = ZoneId.of("Asia/Singapore");

        System.out.println(LocalDateTime.now());
        System.out.println(Instant.now());
        System.out.println(ZonedDateTime.of(date1, time1, zone1));
        System.out.println(ZonedDateTime.of(date1, time1, zone1).toInstant());
        System.out.println(ZonedDateTime.of(date1, time1, zone2));
        System.out.println(ZonedDateTime.of(date1, time1, zone2).toInstant());
        System.out.println(ZonedDateTime.now());
        long epok = ZonedDateTime.now().toEpochSecond();
        System.out.println(Instant.ofEpochSecond(epok));

        System.out.println(DateTimeFormatter.ISO_DATE.format(date1));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(ZonedDateTime.of(date1, time1, zone1)));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(ZonedDateTime.of(date1, time1, zone1)));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(ZonedDateTime.of(date1, time1, zone1)));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(ZonedDateTime.of(date1, time1, zone1)));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).format(ZonedDateTime.of(date1, time1, zone1)));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy E HH:mm z");
        System.out.println(formatter.format(ZonedDateTime.of(date1, time1, zone1)));;

        String stringDate = "Sun, 28 October 2018";
        DateTimeFormatter formatterpl = DateTimeFormatter.ofPattern("dd.MM.yyyy E", Locale.ENGLISH);
        System.out.println(LocalDate.parse(stringDate, formatterpl));
    }
}
