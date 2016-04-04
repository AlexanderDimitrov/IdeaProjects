package SoftwareUniversity;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Write a program that filters an array of strings,
 * finds the numbers in it, and maps them to a list of
 * integers. Sum all the integers and print the result.
 */
public class StreamAPIExersice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] elements = console.nextLine().split(" ");
        List<Integer> asd = Arrays.stream(elements).
                filter(StreamAPIExersice::isNumber).
                map(Integer::parseInt).
                collect(Collectors.toList());
        int sum = asd.stream().collect(Collectors.summingInt(Integer::intValue));
        int secondSum = asd.stream().mapToInt(Integer::intValue).sum();
        int thirdSum = asd.stream().reduce((x,y) -> x+y).get();
        System.out.println(sum);
        System.out.println(secondSum);
        System.out.println(thirdSum);

    }
    private static boolean isNumber(String str){
        for(char ch: str.toCharArray()){
            if(!Character.isDigit(ch)){
                return false;
            }
        }
        return true;
    }

}
