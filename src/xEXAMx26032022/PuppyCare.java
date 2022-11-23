package xEXAMx26032022;

import java.util.Scanner;

public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int foodKg = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int foodInGrams = foodKg * 1000;
        int foodEaten = 0;

        while (!input.equals("Adopted")) {
            int foodInGramsPerMeal = Integer.parseInt(input);
            foodEaten += foodInGramsPerMeal;
            input = scanner.nextLine();
        }
        if (foodEaten <= foodInGrams) {
            System.out.printf("Food is enough! Leftovers: %d grams.", foodInGrams - foodEaten);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.", foodEaten - foodInGrams);
        }

    }
}