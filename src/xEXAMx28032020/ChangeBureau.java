package xEXAMx28032020;

import java.math.BigDecimal;
import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bitcoinCounter = Integer.parseInt(scanner.nextLine());
        double juanCounter = Double.parseDouble(scanner.nextLine());
        double commision = Double.parseDouble(scanner.nextLine());

        double bitcoinInLeva = 1168;
        double juanInDollars = 0.15;
        double dollarInLeva = 1.76;
        double euroInLeva = 1.95d;

        double juanInDollarsResult = juanCounter * juanInDollars;
        double juanInLeva = juanInDollarsResult * dollarInLeva;

        double resultInLeva = bitcoinCounter * bitcoinInLeva + juanInLeva;
        double resultinEuro = resultInLeva / euroInLeva;
    double resultCommision = resultinEuro - (resultinEuro * commision / 100);

        System.out.printf("%.2f", resultCommision);
    }
}
