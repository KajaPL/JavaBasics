package ConditionalStatementsAdvancedEXERCISE;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int celsius = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        String outfitValue = null;
        String shoesValue = null;
        switch (time) {
            case "Morning":
                if (celsius >= 10 && celsius <= 18) {
                    outfitValue = "Sweatshirt";
                    shoesValue = "Sneakers";
                } else if (celsius > 18 && celsius <= 24) {
                    outfitValue = "Shirt";
                    shoesValue = "Moccasins";
                } else if (celsius >= 25) {
                    outfitValue = "T-Shirt";
                    shoesValue = "Sandals";
                }
                break;
            case "Afternoon":
                if (celsius >= 10 && celsius <= 18) {
                    outfitValue = "Shirt";
                    shoesValue = "Moccasins";
                } else if (celsius > 18 && celsius <= 24) {
                    outfitValue = "T-Shirt";
                    shoesValue = "Sandals";
                } else if (celsius >= 25) {
                    outfitValue = "Swim Suit";
                    shoesValue = "Barefoot";
                }
                break;
            case "Evening":
                if (celsius >= 10 && celsius <= 18) {
                    outfitValue = "Shirt";
                    shoesValue = "Moccasins";
                } else if (celsius > 18 && celsius <= 24) {
                    outfitValue = "Shirt";
                    shoesValue = "Moccasins";
                } else if (celsius >= 25) {
                    outfitValue = "Shirt";
                    shoesValue = "Moccasins";
                }
                break;
        }
        System.out.printf("It's %s degrees, get your %s and %s.", celsius, outfitValue, shoesValue);
    }
}
