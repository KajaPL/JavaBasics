package ConditionalStatementsMORE;

import java.util.Scanner;

public class FuelTank1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        double litres = Double.parseDouble(scanner.nextLine());

        switch (type) {
            case "Diesel":
            case "Gas":
            case "Gasoline":
                if (litres >= 25) {
                    System.out.printf("You have enough %s.", type.toLowerCase());
                } else if (litres < 25) {
                    System.out.printf("Fill your tank with %s!", type.toLowerCase());
                }
                break;
            default:
                System.out.printf("Invalid fuel!");
                break;
        }
    }
}
