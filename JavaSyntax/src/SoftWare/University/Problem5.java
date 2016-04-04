package SoftWare.University;


import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        String output = Integer.toString(a,7);
        System.out.println(output);
    }
}
