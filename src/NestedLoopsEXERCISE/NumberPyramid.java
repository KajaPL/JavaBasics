package NestedLoopsEXERCISE;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int currN =  0;
        boolean flag = false;
        for (int rows = 1; rows <= n; rows++) {
            for (int cols = 1; cols <= rows; cols++) {
                currN++;
                if (currN > n) {
                    flag = true;
                    break;
                }
                System.out.print(currN + " ");
            }
            if(flag) {
                break;
            }
            System.out.println();
        }
    }
}
