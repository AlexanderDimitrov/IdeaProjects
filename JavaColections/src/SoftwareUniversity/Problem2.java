package SoftwareUniversity;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by Freeware Sys on 3/29/2016.
 */
public class Problem2 {
    public static void StringEqualizer(String input){
        String[] arrStrings = input.split(" ");
        for (int i = 0; i < arrStrings.length-1;  i++) {
            System.out.print(arrStrings[i] + " ");
            if(!arrStrings[i].equals(arrStrings[i+1])){
                System.out.println();
            }
        }
        System.out.println(arrStrings[arrStrings.length-1]);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        StringEqualizer(input);


    }
}
