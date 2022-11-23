package xEXAMx18072020;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int windowsCount = Integer.parseInt(scanner.nextLine());
        String windowsType = scanner.nextLine();
        String deliveryYesNo = scanner.nextLine();
        double deliveryPrice = 60;
        double windowsPrice = 0;

        if (windowsCount < 10) {
            System.out.println("Invalid order");
            return;
        }

        switch (windowsType) {
            case "90X130":
                windowsPrice = 110 * windowsCount;
                if (windowsCount > 30 && windowsCount <= 60) {
                    windowsPrice = windowsPrice - (windowsPrice * 0.05);
                } else if (windowsCount > 60) {
                    windowsPrice = windowsPrice - (windowsPrice * 0.08);
                }
                break;
            case "100X150":
                windowsPrice = 140 * windowsCount;
                if (windowsCount > 40 && windowsCount <= 80) {
                    windowsPrice = windowsPrice - (windowsPrice * 0.06);
                } else if (windowsCount > 80) {
                    windowsPrice = windowsPrice - (windowsPrice * 0.10);
                }
                break;

            case "130X180":
                windowsPrice = 190 * windowsCount;
                if (windowsCount > 20 && windowsCount <= 50) {
                    windowsPrice = windowsPrice - (windowsPrice * 0.07);
                } else if (windowsCount > 50) {
                    windowsPrice = windowsPrice - (windowsPrice * 0.12);
                }
                break;
            case "200X300":
                windowsPrice = 250 * windowsCount;
                if (windowsCount > 25 && windowsCount <= 50) {
                    windowsPrice = windowsPrice - (windowsPrice * 0.09);
                } else if (windowsCount > 50) {
                    windowsPrice = windowsPrice - (windowsPrice * 0.14);
                }
                break;

        }

        if(deliveryYesNo.equals("With delivery")) {
            windowsPrice += deliveryPrice;
        }

        if (windowsCount > 99) {
            windowsPrice = windowsPrice - (windowsPrice * 0.04);

        }

        System.out.printf("%.2f BGN", windowsPrice);
    }
}
