package ConditionalStatementsAdvancedEXERCISE;

import java.util.Scanner;

public class OperationBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1 = Double.parseDouble(scanner.nextLine());
        double n2 = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;
        String evenOdd = null;

        switch (operator) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero", n1);
                } else if (n2 != 0) {
                    result = n1 / n2;
                    System.out.printf("%.0f %s %.0f = %.2f", n1, operator, n2, Math.abs(result));
                }
                break;
            case "%":
                if (n2 == 0) {
                    System.out.printf("Cannot divide %.0f by zero", n1);
                } else if (n2 != 0) {
                    result = n1 % n2;
                    System.out.printf("%.0f %s %.0f = %.0f", n1, operator, n2, Math.abs(result));
                }
                break;
        }

        if ("+".equals(operator) || "-".equals(operator) || "*".equals(operator)) {
            if (result % 2 == 0) {
                evenOdd = "even";
            } else {
                evenOdd = "odd";
            }
        }
        if ("+".equals(operator) || "-".equals(operator) || "*".equals(operator)) {
            System.out.printf("%.0f %s %.0f = %.0f - %s", n1, operator, n2, result, evenOdd);
        }
    }
}

