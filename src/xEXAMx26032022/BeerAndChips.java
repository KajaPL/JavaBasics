package xEXAMx26032022;

import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double budget = Double.parseDouble(scanner.nextLine());
        int beerCans = Integer.parseInt(scanner.nextLine());
        int chipsPackets = Integer.parseInt(scanner.nextLine());

        double beerPrice = 1.20;
        double beerAll = beerPrice * beerCans;
        double chipsPrice = beerAll - (beerAll * 0.55);
        double chipsAll = Math.ceil(chipsPrice * chipsPackets);

        double sumAll = chipsAll + beerAll;

        if (budget >= sumAll) {
            System.out.printf("%s bought a snack and has %.2f leva left.", name, budget - sumAll);
        } else {
            System.out.printf("%s needs %.2f more leva!", name, sumAll - budget);
        }

    }
}
