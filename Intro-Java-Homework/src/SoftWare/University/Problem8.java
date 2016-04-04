package SoftWare.University;

import java.util.Scanner;

/**
 * Created by iLuvEvz on 16.3.2016 г..
 */
public class Problem8 {
    public static void MethodForAbs(double a,double b,double c){
        double result = a + b + c;
        System.out.printf("%.2f",result/3);
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();
       MethodForAbs(a,b,c);
    }
}
