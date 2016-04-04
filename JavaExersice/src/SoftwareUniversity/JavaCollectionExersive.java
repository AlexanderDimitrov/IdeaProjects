package SoftwareUniversity;




import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Freeware Sys on 4/1/2016.
 */
public class JavaCollectionExersive {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        printRecursive(n);

    }

    private static void printRecursive(int n){


        System.out.println("Az Obicham Evi");
        List<Integer> asd = new ArrayList<Integer>();
        System.out.println(n);
        if(n<1){
            return;
        }
        for (Integer integer : asd) {
            System.out.println(integer);
        }
        asd.add(n);

        printRecursive(n-2);

    }
}
