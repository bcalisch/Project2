import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

/**
 * Use the longnums.txt file in the resources directory for this problem.

 Part 1: Build an array of the 100 numbers (each 50 digits long) contained in longnum.txt,
 and sort them according to size (smallest numbers first). Save this file as p5a.txt in the answers directory.

 Part 2: Find the first 10 digits of the sum of all 100 numbers, and print the answer to the console.
 */
public class LargeSums {
    public static void main(String[] args) {
        ArrayList<String> textFromFile = loadFile();
        ArrayList<BigInteger> bigList = convertText(textFromFile);
        saveToFile(bigList);
        printFirstTenDigits(textFromFile);



    }

    private static void printFirstTenDigits(ArrayList<String> bigList) {
        int size = bigList.size();

        for (int i = 0; i < size; i++) {
            System.out.println("The first 10 digits are :"+ bigList.get(i).substring(0,11));

        }
    }

    private static void saveToFile(ArrayList<BigInteger> bigList) {
        //Saves the prime numbers to the correct spot
        Writer writeThis = null;
        try {
            writeThis = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("answers/p5a.txt"), "utf-8"));
            writeThis.write(bigList.toString());
            writeThis.close();
        } catch (IOException ex) {
            // report
        }

    }

    private static ArrayList<BigInteger> convertText(ArrayList<String> listFromFile) {
        ArrayList<BigInteger> bigList = new ArrayList<BigInteger>();
        int size = listFromFile.size();
        for (int i = 0; i < size; i++) {
            bigList.add(new BigInteger(listFromFile.get(i)));
        }
        sort(bigList);
        return bigList;

    }

    private static ArrayList<String> loadFile() {

        //        Loads the file and puts it into an array of strings, and converts that to an array of ints
       ArrayList<String> innerString = new ArrayList<>();
        String fileName = "resources/longnums.txt", line;

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
               // line = line.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", "");

                innerString.add(line);
                //arrayList.add(convertArray(numberString));

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

        return innerString;
    }
    
}
