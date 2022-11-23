package ConditionalStatementsMORE;

import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int neededHours = Integer.parseInt(scanner.nextLine());
        int freeDays = Integer.parseInt(scanner.nextLine());
        int workersExtraHours = Integer.parseInt(scanner.nextLine());

        int freeDaysInHours = freeDays * 8;
        double freeDaysInHoursReal = freeDaysInHours - (freeDaysInHours * 0.10);
    double extraHours = workersExtraHours * 2 * freeDays;
    double result = freeDaysInHoursReal + extraHours;

    if (result >= neededHours) {
        System.out.printf("Yes!%.0f hours left.", result - neededHours);
    } else {
        System.out.printf("Not enough time!%.0f hours needed.", Math.abs(Math.floor(result - neededHours)));
    }
    }
}
