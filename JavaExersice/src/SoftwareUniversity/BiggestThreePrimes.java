package SoftwareUniversity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Freeware Sys on 4/6/2016.
 */
public class BiggestThreePrimes {
    public static boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        Pattern patern = Pattern.compile("(\\d+)");
        List<Integer> list = new ArrayList<>();
        Matcher matcher = patern.matcher(input);
        int counter =0;
        while(matcher.find()){
            int a = Integer.parseInt(matcher.group());
            list.add(a);
            counter++;
        }
        int[] arr = new int[counter];
        counter = 0;
        for (Integer integer : list) {
            arr[counter] = integer;
            counter++;
        }


        arr = Arrays.stream(arr).distinct().filter(BiggestThreePrimes::isPrime).sorted().toArray();
        int counter2 = arr.length-1;
        int finalSum = 0;
        for (int i = 3; i > 0; i--) {
            finalSum += arr[counter2];
            counter2--;

        }
        System.out.println();
        if(counter==0){
            System.out.println("No");
        }
        else{
            System.out.println(finalSum);
        }


    }
}
