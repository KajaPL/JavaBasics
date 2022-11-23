package FirstStepsInCodingLAB;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        int years = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();
       // System.out.println("You are " + firstName + " " + secondName + ", a " + years + "-years old person from " + town + ".");
        System.out.printf("You are %s %s, a %d-years old person from %s.", firstName, secondName, years, town);
    }
}
