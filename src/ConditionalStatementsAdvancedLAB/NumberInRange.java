package ConditionalStatementsAdvancedLAB;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        if (number >= -100 && number <= 100 && number != 0) {
            System.out.printf("Yes");
        } else {
            System.out.printf("No");
        }
    }
}
