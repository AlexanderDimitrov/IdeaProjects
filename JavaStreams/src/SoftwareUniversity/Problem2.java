package SoftwareUniversity;

import java.io.*;

/**
 * Created by Freeware Sys on 3/26/2016.
 */
public class Problem2 {
    public static void main(String[] args) {


        try(BufferedReader br = new BufferedReader(
                new FileReader("src/SoftwareUniversity/TextFiles/Problem1.txt"))){
            String str;
            String fullText = "";
            while((str = br.readLine())!=null){
                System.out.println(str.toUpperCase());
                fullText += str.toUpperCase() + "\r\n";
            }
            PrintWriter prw = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter("out/production/Problem2Texts.txt")));
            prw.write(fullText);
            br.close();
            prw.close();
        }
        catch(IOException ex){
            System.out.println(ex.toString());
        }
    }
}
