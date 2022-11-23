package xEXAMx06042019;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int movieCounter = Integer.parseInt(scanner.nextLine());
        double sumRatings = 0;
        double minRating = 11;
        double maxRating = 0;
        String movieMinRating = "";
        String movieMaxRating = "";

        for (int i = 1; i <= movieCounter; i++) {
            String movieName = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            sumRatings += rating;
            if (minRating > rating) {
                minRating = rating;
                movieMinRating = movieName;
            }
            if (maxRating < rating) {
                maxRating = rating;
                movieMaxRating = movieName;
            }
        }
        double averageRating = sumRatings / movieCounter;
        System.out.printf("%s is with highest rating: %.1f%n", movieMaxRating, maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n", movieMinRating, minRating);
        System.out.printf("Average rating: %.1f", averageRating);
    }

    // https://judge.softuni.org/Contests/Practice/Index/1596#4
}
