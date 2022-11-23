package FirstStepsInCodingEXERCISE;

import java.util.Scanner;

public class SuppliesForSchoolEXAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pensPackage = Double.parseDouble(scanner.nextLine());
        double markersPackage = Double.parseDouble(scanner.nextLine());
        double boardCleaner = Double.parseDouble(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double pensPackagePrice = 5.80;
        double markersPackagePrice = 7.20;
        double boardCleanerPrice = 1.20;

        double result = (pensPackage * pensPackagePrice) + (markersPackage  * markersPackagePrice) + (boardCleaner * boardCleanerPrice);

        // double result = (pensPackage * 5.80) + (markersPackage * 7.20) + (boardCleaner * 1.20);

        // double discount1 = discount / 100;
        double resultDiscount = result - (result * (discount/100));

        System.out.println(resultDiscount);
    }
}
