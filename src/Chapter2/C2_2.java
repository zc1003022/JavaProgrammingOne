package Chapter2;
import java.util.Scanner;
/**
 * Program reads the radius ad length of a cylinder then computes the area and volume
 *
 * @author Zach Conaughty
 */

public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a Cylinder:");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.println(" The area is" + area);
        System.out.println(" The volume is + volume");
    }
}
