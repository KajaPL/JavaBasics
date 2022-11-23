package ConditionalStatementsAdvancedEXERCISE;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOfStay = Integer.parseInt(scanner.nextLine());
        String typeOfStay = scanner.nextLine();
        String opinion = scanner.nextLine();

        double price = 0;
        double nightOfStay = daysOfStay - 1;

        switch (typeOfStay) {
            case "room for one person":
                price = 18.00;
                break;
            case "apartment":
                price = 25.00;
                if (daysOfStay < 10) {
                    price *= 0.70;
                } else if (daysOfStay >= 10 && daysOfStay < 15) {
                    price *= 0.65;
                } else if (daysOfStay > 15) {
                    price *= 0.50;
                }
                break;
            case "president apartment":
                price = 35.00;
                if (daysOfStay < 10) {
                    price *= 0.90;
                } else if (daysOfStay >= 10 && daysOfStay < 15) {
                    price *= 0.85;
                } else if (daysOfStay > 15) {
                    price *= 0.80;
                }
                break;
        }

        double result = nightOfStay * price;

        if ("positive".equals(opinion)) {
            double positiveResult = result + (result * 0.25);
            System.out.printf("%.2f", positiveResult);
        } else if ("negative".equals(opinion)) {
            double negativeResult = result - (result * 0.10);
            System.out.printf("%.2f", negativeResult);
        }
    }
}
//325 - 100
//x - 65
//x
//211.25 - 100
//x - 125
//x
