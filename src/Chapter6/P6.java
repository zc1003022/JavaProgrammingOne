package Chapter6;

import java.util.Scanner;

/**
 * Program reads Celsius and converts to Fahrenheit
 *
 * @author Zach Conaughty
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double convert = 0;
        System.out.println("How many Euros will a Dollar buy? ");
        double EtoD = input.nextDouble();
        System.out.println("How many Pound Sterling will a Dollar buy? ");
        double PtoD = input.nextDouble();
        System.out.println("How many Yen will a Dollar buy? ");
        double YtoD = input.nextDouble();

        String answer = "";
        do {
            System.out.println("Enter the amout of Dollars you have ");
            double Dollar = input.nextDouble();
            System.out.println("Enter E to buy Euros, P to buy Pounds, Y to buy Yen ");
            String convertTo = input.next().toUpperCase();

            switch (convertTo) {
                case "E":
                    convert = EtoD;
                    System.out.printf("For %.2f Dollar's, you will be able to buy %.2f Euro's ", Dollar, Conversion(Dollar, convert));
                    break;
                case "P":
                    convert = PtoD;
                    System.out.printf("For %.2f Dollar's, you will be able to buy %.2f Pound Sterling ", Dollar, Conversion(Dollar, convert));
                    break;
                case "Y":
                    convert = YtoD;
                    System.out.printf("For %.2f Dollar's, you will be able to buy %.2f Yen ", Dollar, Conversion(Dollar, convert));
                    break;

            }
            do {
                System.out.println("Are there more conversions ? ");
                answer = input.next();
            } while (!answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("yes"));
        } while (answer.equalsIgnoreCase("no"));
    }

    public static double Conversion(double dollar, double currency) {
        if (dollar > 100) {
            return 0.95 * dollar * currency;
        } else {
            return 0.90 * dollar * currency;
        }

    }
}
