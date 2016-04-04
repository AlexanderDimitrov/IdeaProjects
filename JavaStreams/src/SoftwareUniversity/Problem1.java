package SoftwareUniversity;

import com.sun.org.apache.xml.internal.utils.res.StringArrayWrapper;
import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Freeware Sys on 3/25/2016.
 */
public class Problem1 {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                    new FileReader("src/SoftwareUniversity/TextFiles/Problem1.txt"))) {
            String str;
            while ((str = reader.readLine()) != null) {
                char[] s = str.toCharArray();
                int sum = 0;
                for (int i = 0; i < s.length ; i++) {
                    char a = s[i];
                    int number = ((int) a);
                    sum += number;

                }
                System.out.println(sum);

            }
        }
            catch(IOException ex){
                System.out.println("Error In Ze Program");
            }


    }
}
