import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Print the word based on the number given.
 * The commented portion is the
 */
public class PrintNumberInWord {
    public static void main(String[] args) {
        printNumberInWordSwitch();
        printNumberInWordIf();
    }
    public static void printNumberInWordSwitch(){

        //Uses a switch to determine what the word should be depending on the number entered
        Scanner scanner = new Scanner(System.in);
        int number;
        String word ="";

        System.out.println("Enter a number 1-9 and I will print out its word:");

        try {
            number = scanner.nextInt();

            switch(number) {
                case (1): word = "ONE";
                    break;
                case (2): word = "TWO";
                    break;
                case (3): word = "THREE";
                    break;
                case (4): word = "FOUR";
                    break;
                case (5): word = "FIVE";
                    break;
                case (6): word = "SIX";
                    break;
                case (7): word = "SEVEN";
                    break;
                case (8): word = "EIGHT";
                    break;
                case (9): word = "NINE";
                    break;
                default: word = "OTHER";

            }

        }
        catch(InputMismatchException e){
            System.err.println("That is not a number");
        }

        System.out.println("word = " + word);

    }

    public static void printNumberInWordIf(){
        //Uses an If else statement to determine what the word should be depending on the number entered
        Scanner scanner = new Scanner(System.in);
        int number;
        String word ="";

        System.out.println("Enter a number 1-9 and I will print out its word:");

        try {
            number = scanner.nextInt();




            if (number == 1) {

                word = "ONE";
            } else if (number == 2){
                word = "TWO";
            }else if (number == 3){
                word ="THREE";
            }else if (number == 4){
                word ="FOUR";
            }else if (number == 5){
                word ="FIVE";
            }else if (number == 6){
                word ="SIX";
            }else if (number == 7){
                word ="SEVEN";
            }else if (number == 8){
                word ="EIGHT";
            }else if (number == 9){
            word ="NINE";
        }else {
            word ="OTHER";
        }
        }
        catch(InputMismatchException e){
            System.err.println("That is not a number");
        }

        System.out.println("word = " + word);

    }
}
