package xEXAMx02052019;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String productName = scanner.nextLine();
        int count = 0;
        double moneySpend = 0;
        boolean isMoneyFinished = false;
        double neededMoney =0;
        while (!productName.equals("Stop")) {
            Double productPrice = Double.parseDouble(scanner.nextLine());
            count++;
            if (count % 3 == 0) {
                productPrice /= 2;
            }
            if (productPrice > budget) {
                isMoneyFinished = true;
                neededMoney = productPrice - budget;
                break;
            }
            budget -= productPrice;
            moneySpend += productPrice;
            productName = scanner.nextLine();
        }
        if(!isMoneyFinished) {
            System.out.printf("You bought %d products for %.2f leva.", count, moneySpend);
        } else {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", neededMoney);
        }
    }
}
//https://judge.softuni.org/Contests/Practice/Index/1654#3
