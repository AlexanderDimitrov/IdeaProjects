package SoftWare.University;

import java.util.Scanner;


public class Problem3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int integer = console.nextInt();
        float floating = console.nextFloat();
        float floatingB = console.nextFloat();
        String integerHex = Integer.toString(integer,16);
        String integerBinary = Integer.toString(integer,2);
        System.out.printf("| %.10s | %s | %f | | %f ",
                integerHex,integerBinary,floating,floatingB);
    }
}
