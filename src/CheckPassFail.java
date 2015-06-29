import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Check a number given by the user.
 * if the number is greater than or equal to 50, say Pass.
 * otherwise say fail
 */
public class CheckPassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mark;

        System.out.println("Enter a number to test:");

        try {
            mark = scanner.nextInt();


            if (mark >= 50) {

                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }
        catch(InputMismatchException e){
            System.err.println("That is not a number");
        }
    }
}
