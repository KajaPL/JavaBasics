package ConditionalStatementsAdvancedLAB;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0.0d;

        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana":
                        price = 2.50d;
                        break;
                    case "apple":
                        price = 1.20d;
                        break;
                    case "orange":
                        price = 0.85d;
                        break;
                    case "grapefruit":
                        price = 1.45d;
                        break;
                    case "kiwi":
                        price = 2.70d;
                        break;
                    case "pineapple":
                        price = 5.50d;
                        break;
                    case "grapes":
                        price = 3.85d;
                        break;

                }
                break;
            case "Saturday":
            case "Sunday":
                switch (fruit) {
                    case "banana":
                        price = 2.70d;
                        break;
                    case "apple":
                        price = 1.25d;
                        break;
                    case "orange":
                        price = 0.90d;
                        break;
                    case "grapefruit":
                        price = 1.60d;
                        break;
                    case "kiwi":
                        price = 3.00d;
                        break;
                    case "pineapple":
                        price = 5.60d;
                        break;
                    case "grapes":
                        price = 4.20d;
                        break;
                    default:
                        System.out.printf("error");
                        break;
                }
                break;

        }
        if (price > 0) {
            double result = quantity * price;
            System.out.printf("%.2f", result);
        } else {
            System.out.printf("error");
        }

    }
}
