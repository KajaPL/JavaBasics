package FirstStepsInCodingMORE;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hInMeters = Double.parseDouble(scanner.nextLine()); // широчина
        double wInMeters = Double.parseDouble(scanner.nextLine()); // дължина
        double wInCm = wInMeters * 100;
        double hInCm = hInMeters * 100;
        double wInCmNew =wInCm - 100;
        double desks = Math.floor(wInCmNew / 70);
        double rows = Math.floor(hInCm / 120);
    double result  = (desks * rows) - 3;
    System.out.println(result);
    }
}
