package FirstStepsInCodingEXERCISE;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depositSum = Double.parseDouble(scanner.nextLine());
        double depositMonth = Double.parseDouble(scanner.nextLine());
        double interestYear = Double.parseDouble(scanner.nextLine());
        double interest = interestYear / 100;
        double result = depositSum + depositMonth * ((depositSum * interest) / 12);
        System.out.println(result);
    }
}
