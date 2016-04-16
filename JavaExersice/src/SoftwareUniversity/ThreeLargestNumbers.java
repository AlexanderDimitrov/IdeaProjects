package SoftwareUniversity;

import java.math.BigDecimal;
import java.util.*;

/**
 * Created by Freeware Sys on 4/11/2016.
 */
public class ThreeLargestNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = console.nextInt();
        console.nextLine();
        BigDecimal[] asd = new BigDecimal[size];
        for (int i = 0; i < size; i++) {
            String input = console.nextLine();
            asd[i]= new BigDecimal(input);
        }
        Arrays.sort(asd);
        int counter = 3;
        for (int i = asd.length-1; i >= 0 && counter > 0; i--, counter--) {
            System.out.println(asd[i].toPlainString());
        }


    }
}
