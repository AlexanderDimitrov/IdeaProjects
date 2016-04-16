package SoftwareUniversity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Freeware Sys on 4/13/2016.
 */
public class LongestOddEven {
    public static boolean IsOddEven(int a,int b){
        if(!(a%2==0)|a==1&b%2==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        Pattern pattern = Pattern.compile("(\\d+)");
        Matcher matcher = pattern.matcher(input);
        List<Integer> list = new ArrayList<>();
        while(matcher.find()){
            list.add(Integer.parseInt((matcher.group())));
        }
        int[] arr =new int[list.size()];
        for (int i = 0; i < arr.length-1 ; i++) {
            arr[i] = list.get(i);
        }


    }
}
