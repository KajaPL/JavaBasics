package xEXAMx28032020;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacity = Double.parseDouble(scanner.nextLine());
        String input = "";
        double suitcaseVolume = 0;
        int suitcaseCounter = 0;
        while (!input.equals("End")) {
            input = scanner.nextLine();

            if (input.equals("End")) {
                System.out.printf("Congratulations! All suitcases are loaded!%n");
                break;
            }
            suitcaseVolume = Double.parseDouble(input);

            if (suitcaseCounter % 2 == 0 && suitcaseCounter != 0) {
                suitcaseVolume = suitcaseVolume + (suitcaseVolume * 0.1);
            }
            if (capacity <= suitcaseVolume) {
                System.out.println("No more space!");
                break;
            }
            capacity -= suitcaseVolume;
            suitcaseCounter++;

        }
        System.out.printf("Statistic: %d suitcases loaded.", suitcaseCounter);
    }
}
