package ConditionalStatementsMORE;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double foodAll = Double.parseDouble(scanner.nextLine());
        double dogPerDayKg = Double.parseDouble(scanner.nextLine());
        double catPerDayKg = Double.parseDouble(scanner.nextLine());
        double ninjaPerDayGram = Double.parseDouble(scanner.nextLine());

        double ninjaPerDayKg = ninjaPerDayGram / 1000;

        double all = (dogPerDayKg + catPerDayKg + ninjaPerDayKg) * days;

        if (all <= foodAll) {
            System.out.printf("%.0f kilos of food left.", Math.floor(foodAll - all));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.abs(Math.floor(foodAll - all)));
        }
    }
}
