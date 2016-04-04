package SoftWare.University;

import java.util.Scanner;

/**
 * Created by iLuvEvz on 23.3.2016 г..
 */
public class Problem10 {
    public static void Stringer(String str1,String str2) {
        int bestResult = 0;
        int str1Lenght1 = str1.length() - 1;
        int strLenght2 = str2.length() - 1;
        if (str1Lenght1 >= strLenght2) {
            for (int i = 0; i < str1.length(); i++) {
                int c = str1.charAt(i);
                int d = str2.charAt(i);
                bestResult += c * d;
            }
        } else {

            for (int i = 0; i < str2.length(); i++) {
                int c = str2.charAt(i);
                int d = str1.charAt(i);
                bestResult += c * d;
            }
        }
        System.out.println(bestResult);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");
        Stringer(input[0],input[1]);

        System.out.println();
    }
}
