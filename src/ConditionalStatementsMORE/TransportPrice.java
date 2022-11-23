package ConditionalStatementsMORE;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        double taxiStart = 0.70;
        double taxiDay = 0.79;
        double taxiNight = 0.90;

        double bus = 0.09;

        double train = 0.06;

        if (n < 20) {
            if (time.contentEquals("day")) {
                double resultDay = taxiStart + (n * taxiDay);
                System.out.printf("%.2f", resultDay);
            } else {
                double resultNight = taxiStart + (n * taxiNight);
                System.out.printf("%.2f", resultNight);
            }
        } else if (n >= 20 && n < 100) {
            double resultBus = n * bus;
            System.out.printf("%.2f", resultBus);
        } else {
            double resultTrain = n * train;
            System.out.printf("%.2f", resultTrain);
        }
    }
}
