package xEXAMx26032022;

import java.util.Scanner;

public class ComputerRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int hours = Integer.parseInt(scanner.nextLine());
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();

        double pricePerHour = 0;

        switch (month) {
            case "march":
            case "april":
            case "may":
                if (dayOrNight.equals("day")) {
                    pricePerHour = 10.50;
                } else {
                    pricePerHour = 8.40;
                }
                break;
            case "june":
            case "july":
            case "august":
                if (dayOrNight.equals("day")) {
                    pricePerHour = 12.60;
                } else {
                    pricePerHour = 10.20;
                }
                break;
        }
        if (peopleCount >= 4) {
            pricePerHour = pricePerHour - (pricePerHour * 0.10);
        }

        if (hours >= 5) {
            pricePerHour = pricePerHour - (pricePerHour * 0.50);
        }

        double resultAll = peopleCount * pricePerHour * hours;

        System.out.printf("Price per person for one hour: %.2f%n", pricePerHour);
        System.out.printf("Total cost of the visit: %.2f", resultAll);

    }
}
