package SoftwareUniversity;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by Freeware Sys on 4/4/2016.
 */
public class Problem2 {

     public static void main(String[] args) {
         Scanner console = new Scanner(System.in);
         String[] input = console.nextLine().split(" " );
         String command = console.nextLine();
         Integer[] arrInts = new Integer[input.length];
         for (int i = 0; i < arrInts.length ; i++) {
             arrInts[i] = Integer.parseInt(input[i]);
         }
         switch(command){
             case "Descending":
                 List<Integer> asd = Arrays.stream(arrInts).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
                 System.out.println(asd);


                 break;
             case "Ascending":
                 List<Integer> lists = Arrays.stream(arrInts).sorted().collect(Collectors.toList());
                 System.out.println(lists);
                 break;
         }



    }
}
