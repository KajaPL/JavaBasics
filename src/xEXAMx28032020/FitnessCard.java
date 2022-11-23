package xEXAMx28032020;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double cardPrice = 0;

        switch (sport) {
            case "Gym":
                if ("m".equals(sex)) {
                    cardPrice = 42;
                } else if ("f".equals(sex)) {
                    cardPrice = 35;
                }
                break;
            case "Boxing":
                if ("m".equals(sex)) {
                    cardPrice = 41;
                } else if ("f".equals(sex)) {
                    cardPrice = 37;
                }
                break;
            case "Yoga":
                if ("m".equals(sex)) {
                    cardPrice = 45;
                } else if ("f".equals(sex)) {
                    cardPrice = 42;
                }
                break;
            case "Zumba":
                if ("m".equals(sex)) {
                    cardPrice = 34;
                } else if ("f".equals(sex)) {
                    cardPrice = 31;
                }
                break;
            case "Dances":
                if ("m".equals(sex)) {
                    cardPrice = 51;
                } else if ("f".equals(sex)) {
                    cardPrice = 53;
                }
                break;
            case "Pilates":
                if ("m".equals(sex)) {
                    cardPrice = 39;
                } else if ("f".equals(sex)) {
                    cardPrice = 37;
                }
                break;

        }

        if (age <= 19) {
            cardPrice = cardPrice - (cardPrice * 0.20);
        }

        if (cardPrice <= budget) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", cardPrice - budget);
        }
    }
}
