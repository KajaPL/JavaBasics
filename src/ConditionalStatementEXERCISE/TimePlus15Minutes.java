package ConditionalStatementEXERCISE;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int total = hour * 60 + min;
        int total1 = total + 15;

        int hourNew = total1 / 60;
        int minNew = total1 % 60;

        if (hourNew == 24) {
            hourNew = 0;

        }
        if (minNew < 10) {
            System.out.printf("%d:0%d", hourNew, minNew);
        } else {
            System.out.printf("%d:%d", hourNew, minNew);
        }

    }
    }

