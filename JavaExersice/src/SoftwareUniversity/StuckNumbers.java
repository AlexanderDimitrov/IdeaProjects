package SoftwareUniversity;
import java.util.Scanner;

/**
 * Created by Freeware Sys on 4/16/2016.
 */
public class StuckNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        console.nextLine();
        String[] input = console.nextLine().split(" ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int counter =0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                for (int k = 0; k < arr.length; k++) {
                    for (int l = 0; l <arr.length ; l++) {
                        int a = arr[i];
                        int b = arr[j];
                        int c  =arr[k];
                        int d = arr[l];
                        if(a != b && a != c & a != d &&
                                b != c && b != d && c != d){
                            String first = "" + a +b;
                            String second = "" + c +d;
                            if(first.equals(second)) {


                                System.out.printf("%d|%d==%d|%d", a, b, c, d);
                                System.out.println();
                                counter++;
                            }
                        }
                    }
                }
            }


        }
        if(counter==0){

            System.out.println("No");
        }

    }

}
