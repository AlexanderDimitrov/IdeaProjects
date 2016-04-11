package SoftwareUniversity;

import org.apache.xerces.impl.xpath.regex.Match;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Freeware Sys on 4/6/2016.
 */
public class Problem6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        Pattern pattern = Pattern.compile("\\b([A-Z]([a-zA-Z]+)*[A-Z])\\b");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.print(matcher.group() + " ");
        }

    }
}
