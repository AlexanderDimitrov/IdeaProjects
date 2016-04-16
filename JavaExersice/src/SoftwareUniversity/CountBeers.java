package SoftwareUniversity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Freeware Sys on 4/11/2016.
 */
public class CountBeers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int counter = 1;
        List<Integer> listStacks = new ArrayList<>();
        List<Integer> listBeers = new ArrayList<>();
        while(counter>0) {
            String input = console.nextLine();
            if(input.equals("End")){
                break;
            }
            String[] input2 = input.split(" ");
            switch(input2[1]){
                case "beers":
                    listBeers.add(Integer.parseInt(input2[0]));
                    break;
                case "stacks":
                    listStacks.add(Integer.parseInt(input2[0]));
                    break;
            }

        }
        int sumBeers =0;
        for (Integer beer : listBeers) {
            sumBeers+=beer;
        }
        int sumStack =0 ;
        for (Integer stack : listStacks) {
            sumStack+=stack;
        }
        sumStack += sumBeers/20;
        sumBeers = sumBeers%20;
        System.out.printf("%d stacks + %d beers",sumStack,sumBeers);
    }
}
