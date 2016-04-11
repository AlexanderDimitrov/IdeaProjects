package SoftwareUniversity;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Freeware Sys on 4/5/2016.
 * //Write a program to find how
 // many times given string appears
 // in given text as substring. The text is given
 // at the first input line. The search string is given
 // at the second input line. The output is an integer number.
 // Please ignore the character casing
 */
public class Problem2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        String patern = console.nextLine();
        Pattern pattern = Pattern.compile(patern,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        int counter = 0;
        int i =0;
        while((i=input.indexOf(patern,i))!=-1){
            i+= patern.length();
            counter++;
        }
        int counter1 = 0;
        while(matcher.find()){
            counter1 ++;
        }
        System.out.printf("First Test %d" ,counter);
        System.out.println();
        System.out.printf("Second Test : %d" , counter1);
        //Please Throw an answer to this task ,just cant do it and cant find an answer



    }
}
