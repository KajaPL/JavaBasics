package ConditionalStatementEXERCISE;

import java.util.Scanner;

public class LunchBreakEXAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double timeOfEpisode = Double.parseDouble(scanner.nextLine());
        double timeOfBreak = Double.parseDouble(scanner.nextLine());
        double timeForLunch = timeOfBreak / 8.0;
        double timeRelax = timeOfBreak / 4.0;

        double finalTime = timeOfBreak - timeForLunch - timeRelax;

        if (finalTime >= timeOfEpisode) {
            double timeLeft = Math.ceil(finalTime - timeOfEpisode);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, timeLeft);
        } else {
            double notLeft = Math.ceil(timeOfEpisode - finalTime);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, notLeft);
        }
    }
}
