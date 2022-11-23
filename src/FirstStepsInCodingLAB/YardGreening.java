package FirstStepsInCodingLAB;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters = Double.parseDouble(scanner.nextLine());
        double price = 7.61;
        double result = meters * price;
        double discount = result * 0.18;
        double finalResult = result - discount;
        System.out.printf("The final price is: %.2f lv. %n", finalResult);
        System.out.printf("The discount is: %.2f lv.", discount);

        // System.out.printf("The final price is: %.2f lv.", finalResult);
       // System.out.println();
       // System.out.printf("The discount is: %.2f lv.", discount);

    }
}
