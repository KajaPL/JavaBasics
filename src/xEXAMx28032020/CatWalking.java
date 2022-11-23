package xEXAMx28032020;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int walkingMinutesPerDay = Integer.parseInt(scanner.nextLine());
        int walkingCounterPerDay = Integer.parseInt(scanner.nextLine());
        int caloriesPerDay = Integer.parseInt(scanner.nextLine());
        int caloriesPerMinutesOnWalk = 5;

        int resultMinutes = walkingCounterPerDay * walkingMinutesPerDay;
        int resultCalories = resultMinutes * caloriesPerMinutesOnWalk;
        int burnCalories = caloriesPerDay / 2;
        if (resultCalories >= burnCalories) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", resultCalories);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", resultCalories);
        }
    }
}
