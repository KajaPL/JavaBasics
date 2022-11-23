package xEXAMx02052019;

import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double count = Double.parseDouble(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        for (double i = 0; i < count; i++)
        {
            double num = Double.parseDouble(scanner.nextLine());
            if (num % 2 == 0)
            {
                p1 += 1;
            }
            if (num % 3 == 0)
            {
                p2 = p2 + 1;
            }
            if (num % 4 == 0)
            {
                p3++;
            }
        }
        System.out.printf("%.2f%%%n", p1 / count * 100);
        System.out.printf("%.2f%%%n", p2 / count * 100);
        System.out.printf("%.2f%%", p3 / count * 100);
    }
}
