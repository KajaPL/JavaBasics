package ConditionalStatementsAdvancedLAB;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine();
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Friday":
                System.out.printf("12");
                break;
            case "Wednesday":
            case "Thursday":
                System.out.printf("14");
                break;
            case "Saturday":
            case "Sunday":
                System.out.printf("16");
                break;
        }
    }
}
