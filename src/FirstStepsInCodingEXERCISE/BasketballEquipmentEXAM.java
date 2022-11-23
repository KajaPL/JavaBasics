package FirstStepsInCodingEXERCISE;

import java.util.Scanner;

public class BasketballEquipmentEXAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double annualFee = Double.parseDouble(scanner.nextLine());
        double shoesPrice = annualFee - (annualFee * 0.40);
        double clothesPrice = shoesPrice - (shoesPrice * 0.20);
        double basketballPrice = clothesPrice - (clothesPrice * 0.75);
        double accPrice = basketballPrice - (basketballPrice * 0.80);
        double sum = annualFee + shoesPrice + clothesPrice + basketballPrice + accPrice;

        System.out.println(sum);

    }
}
