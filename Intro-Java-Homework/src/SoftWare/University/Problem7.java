package SoftWare.University;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by iLuvEvz on 16.3.2016 г..
 */
public class Problem7 {

    public static void ProblemSolver(String[] input) {
        int[] arrOfInts = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arrOfInts[i] = Integer.parseInt(input[i]);
            if (arrOfInts[i]==0){
                System.out.print("Gee");
            }
            if (arrOfInts[i]==1){
                System.out.print("Bro");
            }
            if (arrOfInts[i]==2){
                System.out.print("Zuz");
            }
            if (arrOfInts[i]==3){
                System.out.print("Ma");
            }
            if (arrOfInts[i]==4){
                System.out.print("Duh");
            }
            if (arrOfInts[i]==5){
                System.out.print("Yo");
            }
            if (arrOfInts[i]==6){
                System.out.print("Dis");
            }
            if (arrOfInts[i]==7){
                System.out.print("Hood");
            }
            if (arrOfInts[i]==8){
                System.out.print("Jam");
            }
            if (arrOfInts[i]==9){
                System.out.print("Mack");
            }


        }
    }
    public static void main(String[] args) {
                Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split("");
        ProblemSolver(input);
        


    }
}
