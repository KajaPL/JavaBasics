package xEXAMx26032022;

import java.util.Scanner;

public class RoomPainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //paint, wallpaper, gloves and brushes
        int paintCount = Integer.parseInt(scanner.nextLine());
        int wallpaperCount = Integer.parseInt(scanner.nextLine());
        double gloverOnePairPrice = Double.parseDouble(scanner.nextLine());
        double brushesPrice = Double.parseDouble(scanner.nextLine());

        double paintPrice = 21.50;
        double wallpaperPrice = 5.20;

        double paintSum = paintPrice * paintCount;
        double wallpaperSum = wallpaperPrice * wallpaperCount;

        double gloverCount = Math.ceil(wallpaperCount * 0.35);
        double brushesCount = Math.floor(paintCount * 0.48);

        double sum = paintSum + wallpaperSum +
                + (gloverCount * gloverOnePairPrice) + (brushesCount * brushesPrice);

        double result = sum / 15;

        System.out.printf("This delivery will cost %.2f lv.", result);

    }
}
