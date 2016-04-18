package SoftwareUniversity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Freeware Sys on 4/17/2016.
 */
public class SimpleExplression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        input = input.replace(" ","");
        Pattern pattern = Pattern.compile("(\\d+)");
        Matcher matcher = pattern.matcher(input);
        List<BigDecimal> list =new ArrayList<>();
        while(matcher.find()){
            list.add(new BigDecimal(matcher.group()));
        }
        int result = 0;
        switch(input){
            case "-":
        }






    }
}
