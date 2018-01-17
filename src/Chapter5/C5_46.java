package Chapter5;

/**
 *
 * @author zc1003022
 */
import java.util.Scanner;

public class C5_46 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println("The reversed string is " + (new StringBuffer(s).reverse().toString()));
    }
}
