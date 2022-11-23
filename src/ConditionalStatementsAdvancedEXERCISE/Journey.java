package ConditionalStatementsAdvancedEXERCISE;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String time = scanner.nextLine();
        String place = null;
        String sleeping = null;
        double expenses = 0;

        if (budget <= 100) {
            place = "Bulgaria";
            if ("summer".equals(time)) {
                expenses = budget - (budget * 0.70);
            } else if ("winter".equals(time)) {
                expenses = budget - (budget * 0.30);
            }
        } else if (budget > 100 & budget <= 1000) {
            place = "Balkans";
            if ("summer".equals(time)) {
                expenses = budget - (budget * 0.60);

            } else if ("winter".equals(time)) {
                expenses = budget - (budget * 0.20);
            }
        } else if (budget > 1000) {
            place = "Europe";
            expenses = budget - (budget * 0.10);
        }

        if (time.equals("winter") || budget > 1000) {
            sleeping = "Hotel";
        } else {
            sleeping = "Camp";
        }

        System.out.printf("Somewhere in %s %n", place);
        System.out.printf("%s - %.2f", sleeping, expenses);

    }
}
