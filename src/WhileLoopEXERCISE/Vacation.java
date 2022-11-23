package WhileLoopEXERCISE;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyNeededForVacation = Double.parseDouble(scanner.nextLine());
        double moneyAtTheMoment = Double.parseDouble(scanner.nextLine());
        int daysCounter = 0;
        int daysSpent = 0;

        while (moneyAtTheMoment < moneyNeededForVacation) {
            if (daysSpent == 5) {
                break;
            }
            String action = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            daysCounter++;
            if (action.equals("save")) {
                moneyAtTheMoment += amount;
                daysSpent = 0;
            } else {
                daysSpent++;
                moneyAtTheMoment -= amount;
                if (moneyAtTheMoment < 0) {
                    moneyAtTheMoment = 0;
                }
            }
        }
        if (daysSpent == 5) {
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        } else  {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }
    }
}
