package ConditionalStatementsAdvancedLAB;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = 0.0;
        switch (town) {
            case "Sofia":
                if (sales >= 0 && sales <= 500) {
                    commission = 5.0;
                } else if (sales > 500 && sales <= 1000) {
                    commission = 7.0;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = 8.0;
                } else if (sales > 10000) {
                    commission = 12.0;
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500) {
                    commission = 4.5;
                } else if (sales > 500 && sales <= 1000) {
                    commission = 7.5;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = 10;
                } else if (sales > 10000) {
                    commission = 13.0;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500) {
                    commission = 5.5;
                } else if (sales > 500 && sales <= 1000) {
                    commission = 8.0;
                } else if (sales > 1000 && sales <= 10000) {
                    commission = 12.0;
                } else if (sales > 10000) {
                    commission = 14.5;
                }
                break;
        }
        if ((!town.equals("Sofia") && !town.equals("Varna") && !town.equals("Plovdiv")) || sales< 0) {
            System.out.println("error");
        } else if (town.equals("Sofia") || (town.equals("Varna") || (town.equals("Plovdiv")) && sales > 0)){
            double result = (sales * commission) / 100;
            System.out.printf("%.2f", result);
        }
    }
}