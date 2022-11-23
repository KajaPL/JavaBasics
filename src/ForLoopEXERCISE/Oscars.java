package ForLoopEXERCISE;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameActor = scanner.nextLine();
        double pointsFromAcademy = Double.parseDouble(scanner.nextLine());
        int jury = Integer.parseInt(scanner.nextLine());
        double nominations = 1250.5;
        double result1 = 0;
        double sum = 0;


        for (int i = 0; i < jury; i++) {
            String nameJury = scanner.nextLine();
            double pointsFromJury = Double.parseDouble(scanner.nextLine());
           result1 = pointsFromAcademy + ((nameJury.length() * pointsFromJury) / 2);
           sum += result1;
           pointsFromAcademy = result1;
           if (pointsFromAcademy > nominations) {
               break;
           }
        }

        if (result1 > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor, result1);

        } else {
            System.out.printf("Sorry, %s you need %.1f more!", nameActor, nominations - result1);
        }
    }
}
