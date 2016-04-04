package SoftwareUniversity;

import com.sun.deploy.util.SyncFileAccess;

import java.io.*;
import java.nio.Buffer;

/**
 * Created by Freeware Sys on 3/28/2016.
 */
public class Problem3 {
    public static void main(String[] args) throws IOException{
        String vowelsSymbols = "aeiou";
        String punctioationSymbols = "!.,?";
        Integer constants = 0;
        Integer vowels = 0;
        Integer punctioations = 0;

        FileInputStream fis = new FileInputStream(new File("src/SoftwareUniversity/TextFiles/words.txt"));
        FileWriter fos = new FileWriter("out/production/Problem3Result.txt");
        int symbol;
        while((symbol = fis.read())!=-1) {
            char ch = (char) symbol;
            if (vowelsSymbols.contains(ch + "")) {
                vowels++;
            } else if (punctioationSymbols.contains(ch + "")) {
                punctioations++;

            } else if (Character.isLetter(ch)) {
                constants++;
            }
        }
        fos.write(String.format("Vowels : %d%n",vowels));
        fos.write(String.format("Constants : %d%n",constants));
        fos.write(String.format("Punctioations : %d%n",punctioations));
        fos.close();
        fis.close();
    }
}

