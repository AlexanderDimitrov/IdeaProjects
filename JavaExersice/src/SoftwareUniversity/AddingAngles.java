package SoftwareUniversity;

import java.util.Scanner;

/**
 * In geometry, an angle is the figure formed
 * by two lines, called the sides of the angle, sharing
 * a common endpoint, called the vertex of the angle. A
 * circle is a geometric shape that can be equated to exactly
 * 360 degrees or one full rotation of a point around the center
 * of the circle. You are given n numbers representing different measurements
 * of angles in degrees. Write a program to find among these numbers all sets
 * of three angles that, summed together, give full circle (one or more full
 * rotations – 360, 720, 1080,…,i x 360 degrees).
 */
public class AddingAngles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int[] arr = new int[a];
        for (int i = 0; i < a ; i++) {
            arr[i] = console.nextInt();
        }
        int counter =0;
        for (int i = 0; i < a; i++) {
            for (int j = i+1; j <a ; j++) {
                for (int k = j+1; k <a ; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum%360==0){
                        System.out.printf("%d + %d + %d = %d degrees",
                                arr[i],arr[j],arr[k],
                                arr[i] + arr[j] + arr[k]);
                        System.out.println();
                        counter ++;
                    }

                }
            }
        }
        if(counter==0){
            System.out.println("No");
        }
    }
}
