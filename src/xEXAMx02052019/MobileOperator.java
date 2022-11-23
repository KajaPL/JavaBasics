package xEXAMx02052019;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String termYears = scanner.nextLine();
        String termType = scanner.nextLine();
        String mobileYesNo = scanner.nextLine();
        int termMonths = Integer.parseInt(scanner.nextLine());
        double price = 0;
        switch (termType) {
            case "Small":
                if(termYears.equals("one")) {
                    price = 9.98;
                } else {
                    price = 8.58;
                }
                break;
            case "Middle":
                if(termYears.equals("one")) {
                    price = 18.99;
                } else {
                    price = 17.09;
                }
                break;
            case "Large":
                if(termYears.equals("one")) {
                    price = 25.98;
                } else {
                    price = 23.59;
                }
                break;
            case "ExtraLarge":
                if(termYears.equals("one")) {
                    price = 35.99;
                } else {
                    price = 31.79;
                }
                break;
        }
        if(mobileYesNo.equals("yes")) {
            if (price <= 10.00) {
                price += 5.50;
            } else if (price > 10.00 && price <= 30) {
                price += 4.35;
            } else if (price > 30) {
                price += 3.85;
            }
        }
        if(termYears.equals("two")) {
            price = price - (price * 0.0375);
        }
        double result = price * termMonths;
        System.out.printf("%.2f lv.", result);
    }
}
