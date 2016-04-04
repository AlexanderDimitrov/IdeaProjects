package SoftWare.University;


import java.util.List;
import java.util.Scanner;

/**
 * Created by iLuvEvz on 23.3.2016 г..
 */
public class Problem11 {
    public static void Odder(int input){
       if(!(input%2==0)){
           System.out.println(input);
       }
    }
    public static void Evener(int input){
        if (input%2==0){
            System.out.println(input);
        }
    }
     public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] inputNumbers = console.nextLine().split(" ");
        String[] inputStrings = console.nextLine().split(" ");
        int[] arr = new int[inputNumbers.length];
         switch(inputStrings[2]){
             case "odd":
                 for (int i = 0; i < inputNumbers.length; i++) {
                     arr[i] = Integer.parseInt(inputNumbers[i]);
                     Odder(arr[i]);
                 }
                 break;

             case "even":
                 for (int i = 0; i < inputNumbers.length; i++) {
                     arr[i] = Integer.parseInt(inputNumbers[i]);
                     Evener(arr[i]);
                 }

         }



    }
}
