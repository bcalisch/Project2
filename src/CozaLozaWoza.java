/**
 * Exercise CozaLozaWoza (Loop & Condition): Write a program called CozaLozaWoza
 * which prints the numbers 1 to 110, 11 numbers per line. The program shall print
 * "Coza" in place of the numbers which are multiples of 3, "Loza" for multiples of 5,
 * "Woza" for multiples of 7,
 * "CozaLoza" for multiples of 3 and 5, and so on. The output shall look like:
 */
public class CozaLozaWoza {
    public static void main(String[] args) {
        StringBuilder words = new StringBuilder();
        String test;

        test = 5 + "this";
        for (int i = 1; i <= 110; i++) {
            words.append(" ");
            if (((i%3) == 0)||((i % 5)==0)|((i % 7)==0)) {
                if (i % 3 == 0) {
                    words.append("Coza");
                    test += i+"loza";
                }
                if ((i % 5) == 0) {
                    words.append("Loza");
                }
                if ((i % 7) == 0) {
                    words.append("Woza");
                }

            }
            else{
                words.append(i);
            }
            if ((i % 11) == 0) {
                words.append("\n");
            }

        }

        System.out.println("words = " + words);
    }
}
