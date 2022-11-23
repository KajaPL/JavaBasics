package ConditionalStatementEXERCISE;

import java.util.Scanner;

public class ShoppingEXAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCarts = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        //Ако броя на видеокартите е по-голям от този на процесорите получава 15% отстъпка от крайната сметка. Важат следните цени:
        // Видеокарта – 250 лв./бр.
        // Процесор – 35% от цената на закупените видеокарти/бр.
        // Рам памет – 10% от цената на закупените видеокарти/бр.

        double videoCartPrice = videoCarts * 250;
        double cpuPrice = (videoCartPrice * 0.35) * cpu;
        double ramPrice = (videoCartPrice * 0.10) * ram;
        double finalPrice = 0;

        if (videoCarts > cpu) {
           finalPrice = (videoCartPrice + cpuPrice + ramPrice) * 0.85;
        }
        else {
            finalPrice = videoCartPrice + cpuPrice + ramPrice;
        }

        if (budget >= finalPrice) {
            System.out.printf("You have %.2f leva left!", budget - finalPrice);
        }
        else {
            System.out.printf("Not enough money! You need %.2f leva more!", finalPrice - budget);
        }
    }
}
