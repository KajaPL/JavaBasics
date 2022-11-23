package FirstStepsInCodingLAB;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dog = Double.parseDouble(scanner.nextLine());
        double cat = Double.parseDouble(scanner.nextLine());
        double dogPrice = 2.50;
        double catPrice = 4.00;
        double dogSum = dog * dogPrice;
        double catSum = cat * catPrice;
      //  double result = dogSum + catSum;
       // System.out.printf("%.1f lv.", result);

        double result1 = dog * 2.50 + cat * 4.00;
        System.out.printf("%.1f lv.", result1);
    }
}
