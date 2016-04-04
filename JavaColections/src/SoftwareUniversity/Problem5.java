package SoftwareUniversity;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Freeware Sys on 3/30/2016.
 */
public class Problem5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        String p = "[.*,.?!<>^:;'\"]";
        Pattern r = Pattern.compile(p);
        input.replaceAll(p," ");
        String[] input1 = input.split(" ");
        ArrayList<String> StringList = new ArrayList<String>();
        for (int i = 0; i < input1.length; i++) {
            StringList.add(input1[i]);
        }


        
        

    }
}
