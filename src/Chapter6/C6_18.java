package Chapter6;

/**
 *
 * @author zc1003022
 */
import java.util.Scanner;

public class C6_18 {

    public static final int PASSWORD_REQUIRED_LENGTH = 8;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a password ");
        String password = input.next();

        if (isValid(password) == true) {
            System.out.println("Valid password ");
        } else {
            System.out.println("Invalid password ");
        }
    }

    public static boolean isValid(String password) {
        // 8 characters
        if (password.length() < 8) {
            return false;
        }
        // only digits and letters
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        //atleast 2 digits
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                ++counter;
            }
        }
        if (counter < 2) {
            return false;
        }

        return true;
    }
}
