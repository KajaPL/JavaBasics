package xEXAMx09032019;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String type = scanner.nextLine();
        double ribbon = 0;
        double hoop = 0;
        double rope = 0;

        switch (country) {
            case "Russia":
                ribbon = 9.100 + 9.400;
                hoop = 9.300 + 9.800;
                rope = 9.600 + 9.000;
                break;
            case "Bulgaria":
                ribbon = 9.600 + 9.400;
                hoop = 9.550 + 9.750;
                rope = 9.500 + 9.400;
                break;
            case "Italy":
                ribbon = 9.200 + 9.500;
                hoop = 9.450 + 9.350;
                rope = 9.700 + 9.150;
                break;
        }
        if (type.equals("ribbon")) {
            System.out.printf("The team of %s get %.3f on %s.%n", country, ribbon, type);
            double result = 100 - (ribbon * 100 / 20.000);
            System.out.printf("%.2f%%", result);
        } else if (type.equals("hoop")) {
            System.out.printf("The team of %s get %.3f on %s.%n", country, hoop, type);
            double result = 100 - (hoop * 100 / 20.000);
            System.out.printf("%.2f%%", result);
        } else if (type.equals("rope")) {
            System.out.printf("The team of %s get %.3f on %s.%n", country, rope, type);
            double result = 100 - (rope * 100 / 20.000);
            System.out.printf("%.2f%%", result);
        }
    }

    // https://judge.softuni.org/Contests/Practice/Index/1538#4
}
