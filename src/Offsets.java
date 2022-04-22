import java.time.*;

public class Offsets {
    public static void main(String[] args) {
        System.out.println(OffsetDateTime.now(ZoneId.of("UTC")));
        System.out.println(OffsetDateTime.now(ZoneId.of("UTC")).toLocalDate());
        System.out.println(OffsetDateTime.now(ZoneId.of("UTC")).toZonedDateTime());
        System.out.println(OffsetDateTime.now(ZoneOffset.UTC));
        System.out.println(OffsetDateTime.now(ZoneOffset.of("+05:00")));
        System.out.println(OffsetDateTime.now(ZoneOffset.ofHours(-2)));
        System.out.println(OffsetDateTime.of(LocalDateTime.now(), ZoneOffset.ofHours(-2)).getOffset());
        System.out.println();

        System.out.println(ZonedDateTime.now());
//        System.out.println(ZoneId.getAvailableZoneIds());
        System.out.println(ZoneId.of("Poland"));
        System.out.println(ZoneId.systemDefault());
        System.out.println();

        ZoneId pacific = ZoneId.of("US/Pacific");
        System.out.println(ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Poland")));
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), pacific);
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime.getOffset());
        System.out.println(zonedDateTime.getZone());
        System.out.println(zonedDateTime.getDayOfMonth());
        System.out.println(zonedDateTime.getDayOfWeek());
        System.out.println(zonedDateTime.getDayOfYear());
        System.out.println();

        ZoneId zone = ZoneId.of("Poland");
//        zone = ZoneId.of("Europe/Paris"); ta sama strefa
        LocalDate date1 = LocalDate.of(2018, 10, 28);
        LocalTime time1 = LocalTime.of(1,55);
        ZonedDateTime dateTime1 = ZonedDateTime.of(date1, time1, zone);
        System.out.println(dateTime1);
        dateTime1 = dateTime1.plusHours(1);
        System.out.println(dateTime1);
        dateTime1 = dateTime1.plusHours(1);
        System.out.println(dateTime1); // java ogarnia zmiane czasu letni na zimowy
    }
}
