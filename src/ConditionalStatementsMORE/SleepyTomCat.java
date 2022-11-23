package ConditionalStatementsMORE;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int freeDays = Integer.parseInt(scanner.nextLine());
        int yearDays = 365;
        int workingDaysPlayInMinutes = 63;
        int freeDaysPlayInMinutes = 127;
        int yearNorm = 30000;

        int workingDaysInMinutesAll = freeDays * freeDaysPlayInMinutes;
        int freeDaysPlayInMinutesAll = (yearDays - freeDays) * workingDaysPlayInMinutes;
        int bothPlays = workingDaysInMinutesAll + freeDaysPlayInMinutesAll;

        if (bothPlays < yearNorm) {
            int result = yearNorm - bothPlays;
            int min = result % 60;
            // TO ME: ако искам да получа от резулата минути, трябва да разделя % 60;
            int hours = result / 60;
            // TO ME: ако искам да получа от резулата часове, трябва да разделя / 60;
            System.out.printf("Tom sleeps well %n");
            // TO ME: %n you can use for new abzac
            System.out.printf("%d hours and %d minutes less for play", hours, min);
        } else {
            int resultMore = bothPlays - yearNorm;
            int min1 = resultMore % 60;
            int hours1 = resultMore / 60;
            System.out.printf("Tom will run away %n");
            System.out.printf("%d hours and %d minutes more for play", hours1, min1);
        }
    }
}
