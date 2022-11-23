package FirstStepsInCodingEXERCISE;

import java.util.Scanner;

public class FoodDeliveryEXAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double chickenMenu = Double.parseDouble(scanner.nextLine());
        double fishMenu = Double.parseDouble(scanner.nextLine());
        double vegeMenu = Double.parseDouble(scanner.nextLine());

        double chickenMenuPrice = 10.35;
        double fishMenuPrice = 12.40;
        double vegeMenuPrice = 8.15;
        double deliveryPrice = 2.50;

        double chickenSum = chickenMenu * chickenMenuPrice;
        double fishSum = fishMenu * fishMenuPrice;
        double vegeSum = vegeMenu * vegeMenuPrice;
        double allMenuSum = chickenSum + fishSum + vegeSum;
        double dessertSum = allMenuSum * 0.20;

        double result = allMenuSum + dessertSum + deliveryPrice;

        System.out.println(result);
    }
}
