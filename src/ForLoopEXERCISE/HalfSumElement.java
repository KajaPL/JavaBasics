package ForLoopEXERCISE;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
           int number = Integer.parseInt(scanner.nextLine());
           if (maxNum < number) {
               maxNum = number;
           }
           sum += number;
        }

        int sumWithoutMaxNum = sum - maxNum;

        if (sumWithoutMaxNum == maxNum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", maxNum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(maxNum-sumWithoutMaxNum));
        }
    }
}
