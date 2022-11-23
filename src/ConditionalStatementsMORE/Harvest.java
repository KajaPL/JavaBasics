package ConditionalStatementsMORE;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double z = Double.parseDouble(scanner.nextLine());
        double workers = Double.parseDouble(scanner.nextLine());

        double allGrozde = x * y;
        double wine = (0.4 * allGrozde) / 2.5;

        if ( wine >= z) {
            double howMuchLeft = wine - z;
            double perWorker = howMuchLeft / workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters. %n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(howMuchLeft), Math.ceil(perWorker));
        } else {
            double wineNeeded = z - wine;
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(wineNeeded));
        }

    }
}
