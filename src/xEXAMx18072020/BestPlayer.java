package xEXAMx18072020;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int bestGoals = Integer.MIN_VALUE;
        String bestPlayer = "";

        while (!name.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > bestGoals) {
                bestGoals = goals;
                bestPlayer = name;
                if (bestGoals >= 10) {
                    break;
                }
            }
            name = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n", bestPlayer);
        if (bestGoals >=3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", bestGoals);
        } else {
            System.out.printf("He has scored %d goals.", bestGoals);
        }
    }
}
