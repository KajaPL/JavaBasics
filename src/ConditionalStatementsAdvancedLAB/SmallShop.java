package ConditionalStatementsAdvancedLAB;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        double price = 0.0d;
        switch (town) {
            case "Sofia":
                switch (product) {
                    case "coffee":
                        price = 0.50d;
                        break;
                    case "water":
                        price = 0.80d;
                        break;
                    case "beer":
                        price = 1.20d;
                        break;
                    case "sweets":
                        price = 1.45d;
                        break;
                    case "peanuts":
                        price = 1.60d;
                }
                break;
            case "Plovdiv":
                switch (product) {
                    case "coffee":
                        price = 0.40d;
                        break;
                    case "water":
                        price = 0.70d;
                        break;
                    case "beer":
                        price = 1.15d;
                        break;
                    case "sweets":
                        price = 1.30d;
                        break;
                    case "peanuts":
                        price = 1.50d;
                }
                break;
            case "Varna":
                switch (product) {
                    case "coffee":
                        price = 0.45d;
                        break;
                    case "water":
                        price = 0.70d;
                        break;
                    case "beer":
                        price = 1.10d;
                        break;
                    case "sweets":
                        price = 1.35d;
                        break;
                    case "peanuts":
                        price = 1.55d;
                }
                break;
        }
        double result = price * count;
        System.out.printf("%f", result);

    }
}
