package SoftwareUniversity;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Freeware Sys on 4/6/2016.
 */
public class Problem5 {
        public static void main(String[] args) {
            Scanner console = new Scanner(System.in);
            String input = console.nextLine();
            String patern = "([a-zA-z{2,}]+)";
            Pattern pattern = Pattern.compile(patern);
            Matcher matcher = pattern.matcher(input);
            int counter = 0;
            while(matcher.find()){
               String s = matcher.group();
                System.out.print(s + " ");
            }


    }
}
//Shoot18297the1231023dwarves!<<<<<< feedback on that needed please!!!
//Strange Stuff on random test ^^^^^
//Thanx in behalf.
