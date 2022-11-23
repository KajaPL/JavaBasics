package FirstStepsInCodingEXERCISE;

import java.util.Scanner;

public class FishTankEXAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        double volumeOfAquarium = length * width * height;
        double volumeInLitres = volumeOfAquarium / 1000;
        double occupiedSpace = percentage / 100;
        double result = volumeInLitres * (1 - occupiedSpace);

        System.out.println(result);
    }
}
