package FirstStepsInCodingMORE;

import java.util.Scanner;
import java.lang.String;
public class WeatherForecast1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String weather = scanner.nextLine();

// На Румен предложението:
      //  String sunnyWeather = "sunny";
     //   if (weather.equals(sunnyWeather)) {
  //          System.out.println("test");
    //    }
     //   else {
      //      System.out.println("dd");
     //   }

        // моето предложение:

        if (weather.contentEquals("sunny")) {
            System.out.println("It's warm outside!");
        }
        else {
            System.out.println("It's cold outside!");
        }

    }
}
