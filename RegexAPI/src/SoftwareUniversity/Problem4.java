package SoftwareUniversity;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Freeware Sys on 4/6/2016.
 */
public class Problem4 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        input =  input.replaceAll("'"," ");
        input = input.replaceAll("-"," ");
        String[] input1= input.split(" ");
        List<String> list = Arrays.stream(input1).collect(Collectors.toList());


        input1 = list.toArray(new String[list.size()]);
        for (int i = 0; i < input1.length; i++) {

        }
        int counter = input1.length;
        System.out.println(counter);
    }
}
