package xEXAMx09032019;

import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tenisRaketaPrice = Double.parseDouble(scanner.nextLine());
        int tenisRaketaCount = Integer.parseInt(scanner.nextLine());
        int converseCount = Integer.parseInt(scanner.nextLine());

        double raketaAll = tenisRaketaPrice * tenisRaketaCount;
        double converseAll = (tenisRaketaPrice / 6) * converseCount;
        double all = raketaAll + converseAll;

        double otherEquipment = all  * 0.2;

        double finalPrice = all + otherEquipment;

        double djokovic = Math.floor(finalPrice / 8);
        double sponsors = Math.ceil(finalPrice * 7 / 8);

        System.out.printf("Price to be paid by Djokovic %.0f%n", djokovic);
        System.out.printf("Price to be paid by sponsors %.0f", sponsors);
    }
}
