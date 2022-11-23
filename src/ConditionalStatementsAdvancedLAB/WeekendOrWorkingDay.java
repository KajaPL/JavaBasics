package ConditionalStatementsAdvancedLAB;

import java.util.Scanner;

public class WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
String day = scanner.nextLine();
switch (day) {
    case "Monday":
    case "Tuesday":
    case "Wednesday":
    case "Thursday":
    case "Friday":
        System.out.printf("Working day");
        break;
    case "Saturday":
    case "Sunday":
        System.out.printf("Weekend");
        break;
    default:
        System.out.println("Error");
}
    }
}
