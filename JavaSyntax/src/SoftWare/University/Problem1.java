package SoftWare.University;

import java.util.Scanner;


public class Problem1 {
    public static void RectangleArea(String[] input) {
        int[] arrOfInts = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arrOfInts[i] = Integer.parseInt(input[i]);
        }
        int result = arrOfInts[0] * arrOfInts[1];
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");
        RectangleArea(input);

    }
}
