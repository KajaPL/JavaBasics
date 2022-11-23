package xEXAMx15062019;

import java.util.Scanner;


public class MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieName = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double izluchvane = Double.parseDouble(scanner.nextLine());

        double result = (tickets * price) * days;
        double izluchvanePercent = result * izluchvane / 100;
        double finalResult = result - izluchvanePercent;
        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, finalResult);
        // https://judge.softuni.org/Contests/Practice/Index/1699#1
    }
}
