package FirstStepsInCodingMORE;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = Double.parseDouble(scanner.nextLine());

        double area = Math.PI * r * r;
        double d = r * 2;
        double perimeter = Math.PI * d;
        System.out.printf("%.2f", area);
        System.out.println();
        System.out.printf("%.2f", perimeter);
    }
}
