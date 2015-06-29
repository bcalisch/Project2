import com.sun.tools.javac.code.Attribute;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


/**
 * Created by benjamin on 6/25/15.
 */
public class NameScores {
    enum ALPHABET{
        A, B, C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z;
    }
    public static void main(String[] args) throws IOException {
        String fileName = "resources/names.txt";
        String[] names = new String[]{};
        StringBuilder sorted = new StringBuilder();
        String line = null, name = "", nameScore = "";
        int alpha = 0, length = 0;
        double totalScore = 0;

        Writer writeScore = null;
        try {
            writeScore = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("answers/p4bNames.txt"), "utf-8"));
        } catch (IOException ex) {
            // report
        }


//Load File and set the single line to the line string
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
                line = line.replaceAll("\"", "");
                names = line.split(",");

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


         Arrays.sort(names);

        //After sorting the array, put the new text into a string



        for (int i = 0; i < names.length; i++) {
            sorted.append("\""+names[i]+"\",");

            alpha = 0;
            name = names[i];
            length = name.length();
            for (int j = 0; j < length ; j++) {
                alpha += (ALPHABET.valueOf(name.substring(j, j+1)).ordinal()+1) *(i+1);

                totalScore+= alpha;
            }



                writeScore.write(names[i]+ ": The Score is "+ alpha+"\n");



        }


        writeScore.write(totalScore+" is the total score");
        try {writeScore.close();} catch (Exception ex) {/*ignore*/}


        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("answers/p4aNames.txt"), "utf-8"));
            writer.write(sorted.toString());

           // System.out.println("Finished Writing to file");
        } catch (IOException ex) {
            System.out.println("did not work");
            // report
        }





    }
}


