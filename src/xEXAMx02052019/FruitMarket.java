package xEXAMx02052019;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberriesPrice = Double.parseDouble(scanner.nextLine());
        double bananasKg = Double.parseDouble(scanner.nextLine());
        double orangeKg = Double.parseDouble(scanner.nextLine());
        double berriesKG = Double.parseDouble(scanner.nextLine());
        double strawberriesKg = Double.parseDouble(scanner.nextLine());

        double berriesPrice = strawberriesPrice / 2;
        double orangePrice = berriesPrice - (berriesPrice * 0.40);
        double bananasPrice = berriesPrice - (berriesPrice * 0.80);

        double result = (strawberriesPrice * strawberriesKg) +
                (bananasPrice * bananasKg) +
                (orangePrice * orangeKg) +
                (berriesPrice * berriesKG);

        System.out.printf("%.2f", result);
    }
}
