package SoftwareUniversity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * We are given a sequence of rectangles in the following format:
 [a1 x b1] [a2 x b2] … [an x bn]
 where a1…an and b1…bn are the sides of the rectangles (positive integers).
 Our goal is to find three consecutive rectangles with largest total area.
 For example, in the following sequence of 6 rectangles we have marked as
 bold the largest 3 rectangles,
 that have total area 31 (4*3 + 1*4 + 5*3 = 31):
 [3 x 3] [3 x 2] [4 x 3] [1 x 4] [5 x 3] [3 x 1]
 Write a program that reads a sequence of rectangles (at least 3)
 in the specified above format and calculates and prints the total
 area of the largest 3 rectangles.
 Input
 The input data should be read from the console. At the first line,
 we have the input sequence of rectangles in the specified format.
 Each rectangle is surrounded in square brackets [ ]. The sides of each
 rectangle are given as two numbers with the 'x' sign between them.
 Anywhere around the numbers and around the other characters we could have
 spaces (one or more space).
 The input data will always be valid and in the format described.
 There is no need to check it explicitly.
 Output
 At the only output line print the total area of the largest
 sequence of 3 rectangles.
 */
public class Largest3Rectangles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        String patern = "(\\d+)";
        Pattern pattern = Pattern.compile(patern);
        Matcher matcher = pattern.matcher(input);
        List<Integer> list = new ArrayList<>();
        int counter=0;
        int counter1= 1;
        while(matcher.find()){
            list.add(Integer.parseInt(matcher.group()));
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length/2; i++) {
            arr[i] = list.get(counter).intValue()*list.get(counter1).intValue();
            counter+=2;
            counter1+=2;
        }
        int bestSum = 0;
        for (int i = 0; i <arr.length-2 ; i++) {
            counter = arr[i]+arr[i+1]+arr[i+2];
            if(bestSum <= counter){
                bestSum= counter;

            }
        }
        System.out.print(bestSum);

    }
}
