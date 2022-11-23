package xEXAMx18072020;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String avioName = scanner.nextLine();
        int  ticketsAdult = Integer.parseInt(scanner.nextLine());
        int ticketsKids = Integer.parseInt(scanner.nextLine());
        double ticketAdultPriceNetto = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double ticketKidPriceNetto = ticketAdultPriceNetto * 0.30;
        double ticketAdultTax = ticketAdultPriceNetto + tax;
        double ticketKidTax = ticketKidPriceNetto + tax;

        double result = (ticketAdultTax * ticketsAdult) + (ticketKidTax * ticketsKids);
        double profit = result - (result * 0.80);
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", avioName, profit);
    }
}
