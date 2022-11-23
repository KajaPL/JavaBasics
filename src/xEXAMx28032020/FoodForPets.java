package xEXAMx28032020;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double food = Double.parseDouble(scanner.nextLine());

        double biscuits = 0;
        double foodEatenDog = 0;
        double foodEatenCat = 0;

        for (int i = 1; i <= days; i++) {
            int eatenDog = Integer.parseInt(scanner.nextLine());
            int eatenCat = Integer.parseInt(scanner.nextLine());
            foodEatenDog += eatenDog;
            foodEatenCat += eatenCat;
            if (i % 3 == 0) {
                biscuits += (eatenDog + eatenCat) * 0.1;
            }
        }

        double sum = foodEatenCat + foodEatenDog;
        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
        double result1 = sum * 100 / food;
        System.out.printf("%.2f%% of the food has been eaten.%n", result1);
        double result2 = foodEatenDog * 100 / sum;
        System.out.printf("%.2f%% eaten from the dog.%n", result2);
        double result3 = foodEatenCat * 100 / sum;
        System.out.printf("%.2f%% eaten from the cat.", result3);
    }
}