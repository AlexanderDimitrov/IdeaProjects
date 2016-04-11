package SoftwareUniversity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DozensOfEggs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<Integer> eggs =new ArrayList<>();
        List<Integer> dozens = new ArrayList<>();
        for (int i = 0; i < 7 ; i++) {
            String[] input = console.nextLine().split(" ");
            switch(input[1]){
                case "dozens":
                    dozens.add(Integer.parseInt(input[0]));
                    break;
                case "eggs":
                    eggs.add(Integer.parseInt(input[0]));
                    break;
            }
        }
        int sumEggs = 0;
        for (Integer egg : eggs) {
            sumEggs+=egg;
        }
        int dozensFinal =sumEggs/12;
        int finalEggs = sumEggs - (dozensFinal*12);
        for (Integer dozen : dozens) {
            dozensFinal+= dozen;
        }
        System.out.printf("%d dozens + %d eggs",dozensFinal,finalEggs);

    }
}
