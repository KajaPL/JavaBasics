package xEXAMx02052019;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double fuelCount = Double.parseDouble(scanner.nextLine());
        String daySaturdaySunday = scanner.nextLine();

        double fuel = 2.10;
        int resident = 100;

        double result = (fuelCount * fuel) + resident;

        if (daySaturdaySunday.equals("Saturday")) {
            result *= 0.90;
        } else if (daySaturdaySunday.equals("Sunday")) {
            result *= 0.80;
        }

        if (result <= budget) {
            System.out.printf("Safari time! Money left: %.2f lv.", budget - result);
        } else {
            System.out.printf("Not enough money! Money needed: %.2f lv.", Math.abs(budget-result));
        }
    }
}
