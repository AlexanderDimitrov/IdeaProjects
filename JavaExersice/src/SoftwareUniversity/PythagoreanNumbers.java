package SoftwareUniversity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Freeware Sys on 4/11/2016.
 */
public class PythagoreanNumbers {
    public static void TheyCool(int a,int b,int c){
        if(c*c ==a*a+b*b){

        }

    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        int[] arr =new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = console.nextInt();
        }
        int resultC = 0;
        int counter =0;
        for (int i = 0; i < size; i++) {
           resultC = arr[i]*arr[i];
            for (int j = 0; j < size; j++) {
                int b = arr[j];
                for (int k = 0; k < size; k++) {
                    int a  = arr[k];
                    if(a>=b) {
                        if (arr[j] * arr[j] + arr[k] * arr[k] == arr[i] * arr[i]) {
                            System.out.printf("%d*%d + %d*%d = %d*%d",
                                    arr[j], arr[j], arr[k], arr[k], arr[i], arr[i]);
                            System.out.println();
                            counter++;
                        }
                    }
                }
            }
        }
        if(counter==0){
            System.out.println("No");
        }
    }
}
