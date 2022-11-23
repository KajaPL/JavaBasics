package WhileLoopEXERCISE;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allowedPoorGrades = Integer.parseInt(scanner.nextLine());
        String nameOfExercise = scanner.nextLine();
        int poorGradesCounter = 0;
        int sumGrades = 0;
        int countTasks = 0;
        String lastTask = null;

        while (!nameOfExercise.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());
            sumGrades += grade;
            countTasks++;
            if (grade <= 4) {
                poorGradesCounter++;
            }

            if (poorGradesCounter >= allowedPoorGrades) {
                System.out.printf("You need a break, %d poor grades.", poorGradesCounter);
                break;
            }
            lastTask = nameOfExercise;
            nameOfExercise = scanner.nextLine();
        }
        if (nameOfExercise.equals("Enough")) {
            double average = sumGrades * 1.0000000001 / countTasks ;
            System.out.printf("Average score: %.2f%n", average);
            System.out.printf("Number of problems: %d%n", countTasks);
            System.out.printf("Last problem: %s", lastTask);
        }
    }
}
