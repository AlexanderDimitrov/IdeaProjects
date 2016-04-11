package SoftwareUniversity;

import java.util.Scanner;

/**
 * Created by Freeware Sys on 4/7/2016.
 */
public class RecursiveFactorial {
    public static int Factorial(int n){
        if(n<1){
            return 1;
        }
        return n*Factorial(n-1);

    }
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        int a = java.nextInt();
        System.out.println("Sout : " + Factorial(a));
    }
}
