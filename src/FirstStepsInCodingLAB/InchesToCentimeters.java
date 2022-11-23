package FirstStepsInCodingLAB;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double inch = 2.54;
        double result = a * 2.54;
        System.out.println(result);
    }
}
