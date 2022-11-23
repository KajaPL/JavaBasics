package ConditionalStatementEXERCISE;

import java.util.Scanner;

public class WorldSwimmingRecordEXAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMeters = Double.parseDouble(scanner.nextLine());
        double timeOfOneMeter = Double.parseDouble(scanner.nextLine());
        //съпротивлението на водата го забавя на всеки 15 м. с 12.5 секунди.
        double resistance = Math.floor(distanceInMeters / 15) * 12.5;
        double time = distanceInMeters * timeOfOneMeter + resistance;

        if (time < recordInSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", time);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", time - recordInSeconds);
        }
    }
}
