package ConditionalStatementsMORE;

import java.util.Scanner;

public class FuelTank2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        double fuel = Double.parseDouble(scanner.nextLine());
        String discountCart = scanner.nextLine();
double price = 0.0;

        switch (type) {
            case "Diesel":
                price = 2.33;
                if ("Yes".equals(discountCart)) {
                    price = price - 0.12;
                }
                break;
            case "Gas":
                price = 0.93;
                if ("Yes".equals(discountCart)) {
                    price = price - 0.08;
                }
                break;
            case "Gasoline":
                price = 2.22;
                if ("Yes".equals(discountCart)) {
                    price = price - 0.18;
                }
                break;

        }


        if (fuel > 20 && fuel <= 25) {
            price = price - (price * 0.08);
        } else if (fuel > 25) {
            price = price - (price * 0.10);
        }

      double  result = price * fuel;

        System.out.printf("%.2f lv.", result);
    }
}
