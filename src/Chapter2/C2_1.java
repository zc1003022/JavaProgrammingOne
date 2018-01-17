package Chapter2;
import java.util.Scanner;
/**
 * Program reads Celsius and converts to Fahrenheit
 *
 * @author Zach Conaughty
 */

public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius:");
        double Celsius = input.nextDouble();
        double Fahrenheit = 9.0 / 5 * Celsius + 32;
        System.out.println(Celsius + " Celsius is " + Fahrenheit + "Fahrenheit");
    }
}
