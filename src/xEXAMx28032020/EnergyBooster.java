package xEXAMx28032020;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String type = scanner.nextLine();
        int typeCounter = Integer.parseInt(scanner.nextLine());
        int big = 5;
        int small = 2;
        double bigPrice = 0;
        double smallPrice = 0;
        double result =0;
        double discount = 0;

        switch (fruit) {
            case "Watermelon":
              smallPrice = 56.00;
              bigPrice =  28.70;
                break;
            case "Mango":
                smallPrice = 36.66;
                bigPrice =  19.60;
                break;
            case "Pineapple":
                smallPrice = 42.10;
                bigPrice =  24.80;
                break;
            case "Raspberry":
                smallPrice = 20.00;
                bigPrice =  15.20;
                break;
        }

        if ("big".equals(type)) {
             result = big * bigPrice * typeCounter;
        } else if ("small".equals(type)) {
             result = small * smallPrice * typeCounter;
        }

        if (result >= 400 && result<=1000) {
            discount = result - (result * 0.15);
        } else if (result > 1000) {
            discount = result / 2;
        } else {
            discount = result;
        }

        System.out.printf("%.2f lv.", discount);
    }
}
