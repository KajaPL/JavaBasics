package xEXAMx18072020;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInput = Integer.parseInt(scanner.nextLine());
        int secondInput = Integer.parseInt(scanner.nextLine());

        int f4 = firstInput % 10;
        int f3 = (firstInput / 10) % 10;
        int f2 = (firstInput / 100) % 10;
        int f1 = (firstInput / 1000) % 10;

        int h4 = secondInput % 10;
        int h3 = (secondInput / 10) % 10;
        int h2 = (secondInput / 100) % 10;
        int h1 = (secondInput / 1000) % 10;

        for (int i = f1; i <= h1; i++) {
            for (int j = f2; j <= h2; j++) {
                for (int l = f3; l <= h3; l++) {
                    for (int w = f4; w <= h4; w++) {
                        if (i % 2 != 0 && j % 2 != 0 && l % 2 != 0 && w % 2 != 0) {
                            System.out.printf("" + i + j + l + w + " ");
                        }
                    }
                }
            }
        }
    }
}


