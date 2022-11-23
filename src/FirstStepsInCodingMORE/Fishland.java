package FirstStepsInCodingMORE;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double skumrijaPrice = Double.parseDouble(scanner.nextLine());
        double cacataPrice = Double.parseDouble(scanner.nextLine());
        double palamudKg = Double.parseDouble(scanner.nextLine());
        double safridKg = Double.parseDouble(scanner.nextLine());
        double midiKg = Double.parseDouble(scanner.nextLine());
        double palamudPrice = skumrijaPrice + (skumrijaPrice * 0.60);
        double safridPrice = cacataPrice + (cacataPrice * 0.80);
        double midiPrice = 7.50;

        double result = (palamudPrice * palamudKg) + (safridPrice * safridKg) + (midiPrice * midiKg);
        System.out.printf("%.2f", result);
    }
}
