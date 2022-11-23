package ConditionalStatementsMORE;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnoliaCount = Integer.parseInt(scanner.nextLine());
        int ziumbiulCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int cactusCount = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double magnolia = 3.25;
        double ziumbiul = 4.00;
        double roses = 3.50;
        double cactus = 8.00;
        double allFlowers = (magnoliaCount * magnolia) + (ziumbiulCount * ziumbiul)
                + (rosesCount * roses) + (cactusCount * cactus);
        //От общата сума, Мария трябва да плати 5% данъци
        double allFlowersTax = allFlowers - (allFlowers * 0.05);

        if (allFlowersTax >= giftPrice) {
            System.out.printf("She is left with %.0f leva.", Math.floor(allFlowersTax - giftPrice));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(giftPrice - allFlowersTax));
        }
    }
}
