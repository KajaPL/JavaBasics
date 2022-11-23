package ConditionalStatementsLAB;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double result = 0;

        if (figure.contentEquals("square")) {
            double s = Double.parseDouble(scanner.nextLine());
            result = s * s;

        } else if (figure.contentEquals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            result = a * b;
        } else if (figure.contentEquals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            result = Math.PI * (r * r);
        } else if (figure.contentEquals("triangle")) {
            double w = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            result = (w * h) / 2;
        }
        System.out.printf("%.3f", result);
    }
}
