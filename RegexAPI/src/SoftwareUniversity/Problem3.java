package SoftwareUniversity;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Freeware Sys on 4/6/2016.
 */
public class Problem3 {
    public static void main(String[] args) {
        int counter = 0;
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");



        String pattern = console.nextLine();
        for (int i = 0; i < input.length; i++) {
            input[i].replace('\'',' ');
            input[i].trim();
            if(pattern.equalsIgnoreCase(input[i])){
                counter++;
            }
        }
        System.out.println(counter);


    }
}
