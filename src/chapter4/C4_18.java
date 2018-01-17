package chapter4;
import java.util.Scanner;
/**
 * Program to display "Welcome to Java" to the console
 *
 * @author Zach Conaughty
 */

public class C4_18 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters ");
        String status = input.next();
        char major
                = Character.toUpperCase(status.charAt(0));
        char grade = status.charAt(1);
        String Major = "";
        String Grade = "";
        if (major == 'M' || major == 'C' || major == 'I') {
            if (grade != '1' && grade != '2' && grade != '3' && grade != '4') {
                System.out.println("invalid input ");
                System.exit(0);
            }
            switch (major) {
                case 'M':
                    Major = "Mathematics ";
                    break;
                case 'C':
                    Major = "Computer Science ";
                    break;
                case 'I':
                    Major = "Information Technolgy ";
                    break;
                default:
                    break;
            }

            switch (grade) {
                case '1':
                    Grade = "Freshman ";
                    break;
                case '2':
                    Grade = "Sophmore ";
                    break;
                case '3':
                    Grade = "Junior ";
                    break;
                case '4':
                    Grade = " Senior ";
                    break;
                default:
                    break;
            }
            System.out.printf("%s %s %n", Major, Grade);
        } else {
            System.out.printf("Invalid input.%n");
        }
    }
}
