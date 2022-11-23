package FirstStepsInCodingMORE;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vegePrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        double vegeKg = Double.parseDouble(scanner.nextLine());
        double fruitsKg = Double.parseDouble(scanner.nextLine());
        double change = 1.94;

        double result = ((vegePrice * vegeKg) + (fruitsPrice * fruitsKg)) / change;

        System.out.printf("%.2f", result);
    }
}
