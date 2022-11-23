package FirstStepsInCodingMORE;

import java.util.Scanner;

public class WeatherForecast2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double degrees = Double.parseDouble(scanner.nextLine());
        if (degrees >= 26.00 && degrees <= 35.00) {
            System.out.printf("Hot");
        }
        else if (degrees >= 20.1 && degrees <= 25.9) {
            System.out.printf("Warm");
        }
        else if (degrees >= 15.00 && degrees <= 20.00) {
            System.out.printf("Mild");
        }
        else if (degrees >= 12.00 && degrees <= 14.9) {
            System.out.printf("Cool");
        }
        else if (degrees >= 5.00 && degrees <= 11.9) {
            System.out.printf("Cold");
        }
        else {
            System.out.printf("unknown");
        }
    }
}
