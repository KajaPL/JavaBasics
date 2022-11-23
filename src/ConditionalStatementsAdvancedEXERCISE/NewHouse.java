package ConditionalStatementsAdvancedEXERCISE;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flower = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());
        ;
     //   double discount = 0.00;
        //double finalPrice = 0.00;
        double price = 0.00;

        if ("Roses".equals(flower)) {
            price = 5.00;
            if (flowerCount > 80) {
                price = price - (price * 0.10);
            } ;
        } else if ("Dahlias".equals(flower)) {
            price = 3.80;
            if (flowerCount > 90) {
                price = price - (price * 0.15);
            } ;
        } else if ("Tulips".equals(flower)) {
            price = 2.80;
            if (flowerCount > 80) {
                price = price - (price * 0.15);
            } ;
        } else if ("Narcissus".equals(flower)) {
            price = 3.00;
            if (flowerCount < 120) {
                price = price + (price * 0.15);
            } ;
        } else if ("Gladiolus".equals(flower)) {
            price = 2.50;

            if (flowerCount < 80) {
                price = price + (price * 0.20);
            }

        }
        double finalPrice = flowerCount * price;

        if (finalPrice <= budget) {
            double left = budget - finalPrice;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flower, left);
        } else {
            double more = finalPrice - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(more));
        }

    }
}
