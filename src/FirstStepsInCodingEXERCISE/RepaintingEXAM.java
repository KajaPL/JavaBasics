package FirstStepsInCodingEXERCISE;

import java.util.Scanner;

public class RepaintingEXAM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nylon = Double.parseDouble(scanner.nextLine());
        double paint = Double.parseDouble(scanner.nextLine());
        double diluent = Double.parseDouble(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double nylonPrice = 1.50;
        double paintPrice = 14.50;
        double diluentPrice = 5.00;
        double bagsPrice = 0.40;

        double nylonSum = (nylon + 2) * nylonPrice;
        double paintSum = (paint + (paint * 0.10)) * paintPrice;
        double diluentSum = diluent * diluentPrice;

        double resultMaterials = nylonSum + paintSum + diluentSum + bagsPrice;
        double resultWorkers = (resultMaterials * 0.30) * hours;
        double resultFinal = resultMaterials + resultWorkers;

        System.out.println(resultFinal);
     }
}
