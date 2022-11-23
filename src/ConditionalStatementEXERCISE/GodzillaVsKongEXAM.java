package ConditionalStatementEXERCISE;

import java.util.Scanner;

public class GodzillaVsKongEXAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int actor = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.10;
        //Декорът за филма е на стойност 10% от бюджета.
        //При повече от 150 статиста, има отстъпка за облеклото на стойност 10%.
        if (actor > 150) {
            clothesPrice = clothesPrice - (clothesPrice * 0.10);
        }
        double result = (clothesPrice * actor) + decor;

        if (result > budget) {
            System.out.printf("Not enough money! %n");
            System.out.printf("Wingard needs %.2f leva more.", result - budget);
        }
        else {
            System.out.printf("Action! %n");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - result);
        }
    }
}
