package xEXAMx06072019;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        double additionalSpend = Double.parseDouble(scanner.nextLine());


        if (nights > 7) {
            pricePerNight = pricePerNight - (pricePerNight * 0.05);
        }

        double spend = budget * additionalSpend / 100;

        double allNights = pricePerNight * nights;
        double result = budget - allNights - spend;

        if (result >= 0) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", result);
        } else {
            System.out.printf("%.2f leva needed.", Math.abs(result));
        }


        // https://judge.softuni.org/Contests/Practice/Index/1745#1
    }
}
