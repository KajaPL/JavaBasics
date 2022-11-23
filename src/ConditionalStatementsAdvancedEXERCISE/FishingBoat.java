package ConditionalStatementsAdvancedEXERCISE;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int fishersCount = Integer.parseInt(scanner.nextLine());

        double price = 0.00;

        if ("Spring".equals(season)) {
            price = 3000.00;
        } else if ("Summer".equals(season) || "Autumn".equals(season)) {
            price = 4200.00;
        } else if ("Winter".equals(season)) {
            price = 2600.00;
        }

        if (fishersCount <= 6) {
            price *= 0.90;
        } else if (fishersCount >= 7 && fishersCount <= 11) {
            price *= 0.85;
        } else if (fishersCount > 12) {
            price *= 0.75;
        }

        if (fishersCount % 2 == 0 && !"Autumn".equals(season)) {
            price *= 0.95;
        }

        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - price));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - price));
        }
    }
}