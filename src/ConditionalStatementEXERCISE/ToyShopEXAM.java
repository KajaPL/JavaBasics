package ConditionalStatementEXERCISE;

import java.util.Scanner;


public class ToyShopEXAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacationPrice = Double.parseDouble(scanner.nextLine());
        double puzzleCount = Double.parseDouble(scanner.nextLine());
        double speakingDollCount = Double.parseDouble(scanner.nextLine());
        double teddyCount = Double.parseDouble(scanner.nextLine());
        double minionsCount = Double.parseDouble(scanner.nextLine());
        double trucksCount = Double.parseDouble(scanner.nextLine());

        double puzzlePrice = 2.60;
        double speakingDollPrice = 3.00;
        double teddyPrice = 4.10;
        double minionsPrice = 8.20;
        double trucksPrice = 2.00;

        double allToysPrice = (puzzleCount * puzzlePrice) + (speakingDollCount * speakingDollPrice) +
                (teddyCount * teddyPrice) + (minionsCount * minionsPrice) + (trucksCount * trucksPrice);

        double allToysCount = puzzleCount + speakingDollCount + teddyCount + minionsCount + trucksCount;

        if (allToysCount >= 50) {
            allToysPrice = allToysPrice - (allToysPrice * 0.25);
        }

        allToysPrice = allToysPrice - (allToysPrice * 0.10);

        if (allToysPrice >= vacationPrice) {
            System.out.printf("Yes! %.2f lv left.", allToysPrice - vacationPrice);
        }
        else {

            System.out.printf("Not enough money! %.2f lv needed.", vacationPrice - allToysPrice);
        }

    }
}
