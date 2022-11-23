package xEXAMx28032020;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double naem = Double.parseDouble(scanner.nextLine());
        double cakePrice = naem * 20 / 100;
        double drinksPrice = cakePrice - (cakePrice * 0.45);
        double animatorPrice = naem / 3;
        double neededMoney = naem + cakePrice + drinksPrice + animatorPrice;
        System.out.printf("%.1f", neededMoney);
    }
}
