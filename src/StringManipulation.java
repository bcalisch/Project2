import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * String Manipulation
 * <p/>
 * Prompt a user to input a string of any kind into the console.
 * Then, ignoring special characters, increment each letter one
 * farther down the alphabet (e.g. a->b, o->p, z->a, etc.).
 * Return the string to the console.
 */
public class StringManipulation {

    public static void main(String[] args) {
        //Take in a string.  Convert to char array
        // then increment to next character if that character
        //is a letter.
        Scanner scanner = new Scanner(System.in);
        String sentence;
        StringBuilder newSentence = new StringBuilder();
        System.out.print("Enter a string to test:");
        sentence = scanner.nextLine();
        char[] letters = sentence.toCharArray();
        int size = letters.length, letterNum;

        for (int i = 0; i < size; i++) {
            letterNum = (int) letters[i];
            if ((letterNum > 64 && letterNum < 90) || (letterNum > 96 && letterNum < 122)) {
                letters[i] = (char) ((int) letters[i] + 1);
             newSentence.append(letters[i]);
            }else if(letterNum == 90){
                letters[i] = (char) 65;
                newSentence.append(letters[i]);
            }else if(letterNum == 122){
                letters[i] = (char) 97;
                newSentence.append(letters[i]);
            }else if (letterNum == 32){
                newSentence.append(" ");
            }else{
                newSentence.append(letters[i]);
            }
        }
        System.out.println(newSentence);

//        try {ABCDEFGHIJKLMNOPQRSTUVWXYZ abcdefghijklmnopqrstuvwxyz
//            sentence = scanner.nextInt();
//
//
//            if (sentence >= 50) {
//
//                System.out.println("PASS");
//            } else {
//                System.out.println("FAIL");
//            }
//        }
//        catch(InputMismatchException e){
//            System.err.println("That is not a number");
//        }
        }

    }
