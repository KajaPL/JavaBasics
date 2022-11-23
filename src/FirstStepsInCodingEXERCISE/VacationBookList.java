package FirstStepsInCodingEXERCISE;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pagesInBook = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int result =  (pagesInBook / pagesPerHour) / days;

        System.out.println(result);
    }
}
