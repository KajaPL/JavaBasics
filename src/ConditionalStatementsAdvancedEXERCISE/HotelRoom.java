package ConditionalStatementsAdvancedEXERCISE;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        double nights = Double.parseDouble(scanner.nextLine());
        double apartmentPrice = 0.00;
        double studioPrice = 0.00;

        switch (month) {
            case "May":
            case "October":
                apartmentPrice = 65.00;
                studioPrice = 50.00;
                break;
            case "June":
            case "September":
                apartmentPrice = 68.70;
                studioPrice = 75.20;
                break;
            case "July":
            case "August":
                apartmentPrice = 77.00;
                studioPrice = 76.00;
                break;
        }

        if (nights > 7 && nights <= 14 && "May".equals(month)) {
            studioPrice = studioPrice - (studioPrice * 0.05);
        } else if (nights > 7 && nights <= 14 && "October".equals(month)) {
            studioPrice = studioPrice - (studioPrice * 0.05);
        } else if (nights > 14 && "May".equals(month)) {
            studioPrice = studioPrice - (studioPrice * 0.30);
            apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
        } else if (nights > 14 && "October".equals(month)) {
            studioPrice = studioPrice - (studioPrice * 0.30);
            apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
        } else if (nights > 14 && "June".equals(month)) {
            studioPrice = studioPrice - (studioPrice * 0.20);
            apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
        } else if (nights > 14 && "September".equals(month)) {
            studioPrice = studioPrice - (studioPrice * 0.20);
            apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
        } else if (nights > 14 && "July".equals(month)) {
            apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
        }else if (nights > 14 && "August".equals(month)) {
            apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
        }

        double finalApartment = nights * apartmentPrice;
        double finalStudio = nights * studioPrice;

        System.out.printf("Apartment: %.2f lv.%n", finalApartment);
        System.out.printf("Studio: %.2f lv.", finalStudio);
    }
}
