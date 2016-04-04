package SoftWare.University;

import java.util.Scanner;


public class Problem2 {
    public static void TriangleAreaChecker
            (String[] input,String[] input1,String[] input2){
        int aX = Integer.parseInt(input[0]);
        int aY = Integer.parseInt(input[1]);
        int bX = Integer.parseInt(input1[0]);
        int bY = Integer.parseInt(input1[1]);
        int cX = Integer.parseInt(input2[0]);
        int cY = Integer.parseInt(input2[1]);

        int result = ((aX*(bY -cY))+(bX*(cY-aY))+(cX*(aY-bY)))/2;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");
        String[] input1 = console.nextLine().split(" ");
        String[] input2 = console.nextLine().split(" ");
        TriangleAreaChecker(input,input1,input2);
    }
}
