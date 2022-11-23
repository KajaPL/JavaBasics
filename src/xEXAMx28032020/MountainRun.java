package xEXAMx28032020;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double oneMeterInSecond = Double.parseDouble(scanner.nextLine());

        double resultInSeconds = meters * oneMeterInSecond;
       double zabaviane = Math.floor(meters / 50) * 30;
       double sum = resultInSeconds + zabaviane;

       if (sum >= recordInSeconds) {
           System.out.printf("No! He was %.2f seconds slower.", sum - recordInSeconds);
       } else {
           System.out.printf("Yes! The new record is %.2f seconds.", sum);
       }
    }
}
