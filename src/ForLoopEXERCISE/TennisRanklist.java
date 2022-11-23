package ForLoopEXERCISE;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tournirs = Integer.parseInt(scanner.nextLine());
        double startPoints = Integer.parseInt(scanner.nextLine());
        double finalPoints = 0;
        double counterW = 0;

        double total = 0;

        for (int i = 1; i <= tournirs; i++) {
            String etapTournir = scanner.nextLine();
            total += tournirs;
            if ("W".equals(etapTournir)) {
                finalPoints += 2000;
                counterW ++;
            } else if ("F".equals(etapTournir)) {
                finalPoints += 1200;
            } else if ("SF".equals(etapTournir)) {
                finalPoints += 720;
            }
        }
        double allPoints = startPoints + finalPoints;
        double averagePoints = finalPoints / tournirs;

        System.out.printf("Final points: %.0f%n", allPoints);
        System.out.printf("Average points: %.0f%n", Math.floor(averagePoints));
        System.out.printf("%.2f%%", counterW / tournirs * 100);
    }
}
