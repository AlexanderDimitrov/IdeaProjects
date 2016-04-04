package SoftWare.University;

import java.util.Scanner;


public class Problem4 {
        public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();
        double firstCalculation = (a*a+b*b)/(a*a-b*b);
        double secondCalculation = Math.pow(firstCalculation,(a+b+c)/Math.sqrt(c));
        double firstCalculation2 = (a*a + b*b-Math.pow(c,3));
        double secondCalculation2 = Math.pow(firstCalculation2,a-b);
        double firstAvarage =(a+b+c)/3;
            double secondAvarage = (secondCalculation+secondCalculation2)/2;
            double resultAvarage = firstAvarage - secondAvarage;
        System.out.printf("F1 result : %.2f;F2 result : %.2f; Diff : %.2f"
                ,secondCalculation,secondCalculation2,Math.abs(resultAvarage));


    }
}
