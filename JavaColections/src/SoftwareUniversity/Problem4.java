package SoftwareUniversity;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.util.Scanner;

/**
 * Created by Freeware Sys on 3/30/2016.
 */
public class Problem4 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] arr = console.nextLine().split(" ");
        int[] arrInts = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrInts[i] = Integer.parseInt(arr[i].toString());
        }
        System.out.print(arr[0] + " ");
        int minimumIndex = 0;
        int maximumIndex = 0;
        int end = 0;

        for (int i = 1; i < arr.length -1; i++) {
            if(arrInts[i]> arrInts[i-1]){
                minimumIndex++;
                System.out.print(arrInts[i] + " ");
            } else {
                minimumIndex = 1;
                System.out.println();
                System.out.print(arrInts[i] + " ");
            }
            if(minimumIndex>maximumIndex){
                maximumIndex = minimumIndex;
                end = i;
            }
        }
        System.out.println();
        System.out.print("Longest : ");
        for (int i = end - maximumIndex + 1; i <= end  ; i++) {
            System.out.print(arrInts[i] + " ");
        }
    }
}
