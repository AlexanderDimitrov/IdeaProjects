package SoftwareUniversity;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Freeware Sys on 4/16/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        Random rndm = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = rndm.nextInt(5);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
