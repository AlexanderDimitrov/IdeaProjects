package SoftWare.University;


import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by iLuvEvz on 16.3.2016 г..
 */
public class Problem5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int counter = 1;
        int secondCounter =1;

        for (int i = 0; i < a; i++) {
            int number =1;
            for (int j = 0; j < counter; j++) {
                System.out.print(number + " ");
                number++;

            }
            System.out.println();
            counter++;
            secondCounter = counter;

        }
        secondCounter = secondCounter -2;
        for (int i = 0; i < a-1 ; i++) {
            int number = 1;
            for (int j = 0; j < secondCounter; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
            secondCounter--;
        }
    }

}


