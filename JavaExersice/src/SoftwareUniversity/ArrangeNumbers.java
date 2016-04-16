package SoftwareUniversity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Freeware Sys on 4/11/2016.
 */
public class ArrangeNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        input = input.replace(",","");
        String[] input2 = input.split(" ");
        int[] arr = new int[input2.length];
        HashSet<String> table = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(input2[i] + " ");
            table.add(input2[i]);
        }
        System.out.println(table);
    }
}
