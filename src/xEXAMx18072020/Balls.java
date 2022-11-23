package xEXAMx18072020;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ballsCount = Integer.parseInt(scanner.nextLine());

        int points = 0;
        int redBallsCounter = 0;
        int orangeBallsCounter = 0;
        int yellowBallsCounter = 0;
        int whiteBallsCounter = 0;
        int blackBallsCounter = 0;
        int otherColorsBallsCounter = 0;

        for (int i = 1; i <= ballsCount; i++) {
            String currentColor = scanner.nextLine();
            if (currentColor.equals("red")) {
                points += 5;
                redBallsCounter++;
            }  else if (currentColor.equals("orange")) {
                points += 10;
                orangeBallsCounter++;
            } else if (currentColor.equals("yellow")) {
                points += 15;
                yellowBallsCounter++;
            } else if (currentColor.equals("white")) {
                points += 20;
                whiteBallsCounter++;
            } else if (currentColor.equals("black")) {
                points /= 2;
                blackBallsCounter++;
            } else {
                otherColorsBallsCounter++;
            }
        }
        System.out.printf("Total points: %d%n", points);
        System.out.printf("Red balls: %d%n", redBallsCounter);
        System.out.printf("Orange balls: %d%n", orangeBallsCounter);
        System.out.printf("Yellow balls: %d%n", yellowBallsCounter);
        System.out.printf("White balls: %d%n", whiteBallsCounter);
        System.out.printf("Other colors picked: %d%n", otherColorsBallsCounter);
        System.out.printf("Divides from black balls: %d", blackBallsCounter);
    }
}
