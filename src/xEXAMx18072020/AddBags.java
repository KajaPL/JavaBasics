package xEXAMx18072020;

import java.util.Scanner;

public class AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suitcaseAbove20Price = Double.parseDouble(scanner.nextLine());
        double suitcaseKg = Double.parseDouble(scanner.nextLine());
        int daysUntilTravel = Integer.parseInt(scanner.nextLine());
        int suitcaseCounter = Integer.parseInt(scanner.nextLine());

        double suitcasePrice = 0;

        if (suitcaseKg < 10) {
            suitcasePrice = suitcaseAbove20Price - (suitcaseAbove20Price * 0.80);
        } else if (suitcaseKg >= 10 && suitcaseKg <= 20) {
            suitcasePrice = suitcaseAbove20Price - (suitcaseAbove20Price * 0.50);
        } else if (suitcaseKg > 20) {
            suitcasePrice = suitcaseAbove20Price;
        }

        if (daysUntilTravel > 30) {
            suitcasePrice = suitcasePrice + (suitcasePrice * 0.10);
        } else if (daysUntilTravel >= 7 && daysUntilTravel <= 30) {
            suitcasePrice = suitcasePrice + (suitcasePrice * 0.15);
        } else if (daysUntilTravel < 7) {
            suitcasePrice = suitcasePrice + (suitcasePrice * 0.40);
        }
        double result = suitcasePrice * suitcaseCounter;
        System.out.printf("The total price of bags is: %.2f lv.", result);

    }
}
