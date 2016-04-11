package SoftwareUniversity;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem1 {
    public static boolean IsLonger(String input){
        char[] arr = input.toCharArray();
        if(arr.length>3){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");
        System.out.println(Arrays.stream(input).filter(Problem1::IsLonger).collect(Collectors.toList()));
    }
}
