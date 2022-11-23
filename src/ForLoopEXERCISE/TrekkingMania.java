package ForLoopEXERCISE;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hikersGroups = Integer.parseInt(scanner.nextLine());

        int musalaCounter = 0;
        int monblanCounter = 0;
        int kiliCounter = 0;
        int k2Counter = 0;
        int everestCounter = 0;

        int total = 0;

        for (int i = 1; i <= hikersGroups; i++) {
            int peopleCount = Integer.parseInt(scanner.nextLine());
            total += peopleCount;
            if (peopleCount <= 5) {
                musalaCounter += peopleCount;
            } else if (peopleCount <= 12) {
                monblanCounter += peopleCount;
            } else if (peopleCount <= 25) {
                kiliCounter += peopleCount;
            } else if (peopleCount <= 40) {
                k2Counter += peopleCount;
            } else if (peopleCount >= 41) {
                everestCounter += peopleCount;
            }
        }
        System.out.printf("%.2f%%%n", (double)musalaCounter / total * 100);
        System.out.printf("%.2f%%%n", (double)monblanCounter / total * 100);
        System.out.printf("%.2f%%%n", (double)kiliCounter / total * 100);
        System.out.printf("%.2f%%%n", (double)k2Counter / total * 100);
        System.out.printf("%.2f%%", (double)everestCounter / total * 100);
    }
}
