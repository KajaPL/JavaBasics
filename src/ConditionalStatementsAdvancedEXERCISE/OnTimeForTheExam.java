package ConditionalStatementsAdvancedEXERCISE;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeOfExamHour = Integer.parseInt(scanner.nextLine());
        int timeOfExamMin = Integer.parseInt(scanner.nextLine());
        int timeOfArrayHour = Integer.parseInt(scanner.nextLine());
        int timeOfArrayMin = Integer.parseInt(scanner.nextLine());

        int examAll = (timeOfExamHour * 60) + timeOfExamMin;
        int timeOfArrayAll = (timeOfArrayHour * 60) + timeOfArrayMin;

        int diff = Math.abs(examAll - timeOfArrayAll);
        int hour = diff / 60;
        int min = diff % 60;

        if (examAll < timeOfArrayAll) {
            System.out.println("Late");
            if (diff <= 59) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                System.out.printf("%d:%02d hours after the start", hour, min);
            }
        } else if (examAll == timeOfArrayAll || diff <= 30) {
            System.out.println("On time");
            if (diff != 0) {
                System.out.printf("%d minutes before the start", diff);
            }
        } else {
            System.out.println("Early");
            if (diff <= 59) {
                System.out.printf("%d minutes before the start", diff);
            } else {
                System.out.printf("%d:%02d hours before the start", hour, min);
            }
        }
    }
}
