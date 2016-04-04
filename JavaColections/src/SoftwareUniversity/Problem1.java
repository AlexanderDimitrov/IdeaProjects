package SoftwareUniversity;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Freeware Sys on 3/29/2016.
 */
public class Problem1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter Integer for arr size : ");
        int arrSize = console.nextInt();
        System.out.println("Place your arrbers with a space please :");
        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = console.nextInt();
        }
        int temp =0;
        int customarrber = 0;
        for(int i=0; i < arr.length-1; i++){

            for(int j=1; j < arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    temp=arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
