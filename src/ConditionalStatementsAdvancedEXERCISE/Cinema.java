package ConditionalStatementsAdvancedEXERCISE;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projection = scanner.nextLine();
        double rowsCount = Double.parseDouble(scanner.nextLine());
        double collumnsCount = Double.parseDouble(scanner.nextLine());
        double premierePrice = 12.00;
        double normalPrice = 7.50;
        double discountPrice = 5.00;
        double income = 0.0;
        if ("Premiere".equals(projection)) {
            income = rowsCount * collumnsCount * premierePrice;
        } else if ("Normal".equals(projection)) {
            income = rowsCount * collumnsCount * normalPrice;
        } else if ("Discount".equals(projection)) {
            income = rowsCount * collumnsCount * discountPrice;
        }
        System.out.printf("%.2f", income);
    }
}
