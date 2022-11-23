package ConditionalStatementsMORE;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double volume = Double.parseDouble(scanner.nextLine());
        double p1 = Double.parseDouble(scanner.nextLine());
        double p2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double filledPoolP1 = h * p1;
        double filledPoolP2 = h * p2;
        double bothP = filledPoolP1 + filledPoolP2;

        double result = volume - bothP;

        if (result >= 0) {
            double filledVolume = (volume - result) / volume * 100.0;
            double firstPipePercent = p1 / (p1 + p2) * 100.0;
            double secondPipePercent = p2 / (p1 + p2) * 100.0;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.", filledVolume, firstPipePercent, secondPipePercent);
            //TO ME: if you want to escape percentage, you must use doubled sign as this %%
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, Math.abs(result));
        }

    }
}
