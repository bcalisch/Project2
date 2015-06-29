
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Part 1: Build your own array of all of the prime numbers up to 100,
 * and store that array in a text file primearray.txt in the answers directory.
 * Save your project files in the answers directory.
 * <p/>
 * Part 2: Have the class Consecutive take an array of integers from primearr.txt
 * and return the minimum number of integers needed to make the contents of the
 * array consecutive from the lowest number to the highest number.
 * For example: If arr contains [4, 8, 6] then the output should be 2,
 * because two numbers need to be added to the array (5 and 7) to make
 * it a consecutive array of numbers from 4 to 8. Print out the answers
 * for arrays of the first 5 primes, the first 10 primes, the first 50 primes,
 * and the first 100 prime numbers on separate lines.
 */
public class ConsecutiveNumbers {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> outerInt = loadFileToList();
        displayNumbers(outerInt);
        savePrimeToFile(100);

    }

    private static void savePrimeToFile(int primeNum) {
        //Saves the prime numbers to the correct spot
        List<Integer> Prime100 = findPrimeNumbers(primeNum);



        Writer writeThis = null;
        try {
            writeThis = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("answers/primeArray.txt"), "utf-8"));
            writeThis.write(Prime100.toString());
            writeThis.close();
        } catch (IOException ex) {
            // report
        }


    }

    private static void displayNumbers(ArrayList<ArrayList<Integer>> outerInt) {
        //Goes through each Item in the array and prints out the consecutive numbers
        //in the ArrayList of Arraylists of Int
        for (int i = 0; i < outerInt.size(); i++) {
            System.out.println(outerInt.get(i)+ ": "+consecutiveNumbers(outerInt.get(i)));

        }
    }

    private static ArrayList<ArrayList<Integer>> loadFileToList() {
//        Loads the file and puts it into an array of strings, and converts that to an array of ints
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
        ArrayList<String> innerString = new ArrayList<String>();
        String fileName = "resources/primearr.txt", line = null;
        String[] numberString = new String[]{};

        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try {
            while ((line = bufferedReader.readLine()) != null) {
                //  System.out.println("line = " + line);
                line = line.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", "");

                innerString.add(line);
                numberString = line.split(" ");

                arrayList.add(convertArray(numberString));

                //System.out.println("arrayList = " + arrayList);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Done with the file

        return arrayList;
    }

    private static ArrayList<Integer> convertArray(String[] numberString) {
        //converts array of string to array of ints
        ArrayList<Integer> convertedStringToInt = new ArrayList<Integer>();
        for (int i = 0; i < numberString.length; i++) {
            convertedStringToInt.add(Integer.valueOf(numberString[i]));
        }
        return convertedStringToInt;


    }

    private static int consecutiveNumbers(List<Integer> list) {
        //Finds the consecutive numbers between two numbers in a list
        int count = 0;
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            if (i != list.get(i)) {
                count++;
            }

        }

        return count;
    }

    private static List<Integer> findPrimeNumbers(int primeTotal) {
        //Finds the appropriate number of Prime numbers
        List<Integer> primeNum = new ArrayList<Integer>();
        boolean prime = false;
        int primeSize = primeNum.size();
        for (int i = 0;primeSize < primeTotal ; i++) {
            prime = true;
            for (int j = 2; j < i; j++) {
                if ((i != j) && (i % j) == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primeNum.add(i);
                primeSize++;
            }
        }
        
        //Shuffle the prime number arrays to give me a challenge :)
        Collections.shuffle(primeNum);


        return primeNum;
    }

}
