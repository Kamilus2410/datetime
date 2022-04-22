import java.time.LocalDate;

public class Manipulacje {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2020, 1 ,20);
        System.out.println("org: " + ld);
        System.out.println("plusdays " + ld.plusDays(1));
        System.out.println("plusweeks " + ld.plusWeeks(1));
        System.out.println("plusmonths " + ld.plusMonths(1));
        System.out.println("plusyears " + ld.plusYears(1));
        System.out.println(ld.getDayOfWeek());
        System.out.println(ld.isLeapYear());
        System.out.println(ld.isBefore(ld));
    }
}
