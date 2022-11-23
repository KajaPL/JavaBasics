package FirstStepsInCodingMORE;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double stranicznaStena = x * y;
        double prozorec = 1.5 * 1.5;
        double stenaProzorec = 2 * stranicznaStena - 2 * prozorec;
        double zadnaStena = x * x;
        double vhod = 1.2 * 2;
        double stenaVhod = 2 * zadnaStena - vhod;
        double steniresult = stenaProzorec + stenaVhod;
        double steniPaint = steniresult / 3.4;

        double pravoagalnikPokriv = 2 * (x * y);
        double agalnikPokriv = 2 * (x * h / 2);
        double pokrivResult = pravoagalnikPokriv + agalnikPokriv;
        double pokrivPaint = pokrivResult / 4.3;

        System.out.printf("%.2f", steniPaint);
        System.out.println();
        System.out.printf("%.2f", pokrivPaint);
    }
}
