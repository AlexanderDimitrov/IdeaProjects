package SoftwareUniversity;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Freeware Sys on 4/5/2016.
 */
public class Problem1 {
    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        Pattern pattern = Pattern.compile("([a-zA-z.]+)@([a-zA-Z.]+)");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println("Email: " + matcher.group().toString());
        }
    }
}
