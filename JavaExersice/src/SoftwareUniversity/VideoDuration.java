package SoftwareUniversity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Peter watches videos every day. Once he wanted to calculate
 * how many time he spends watching videos. He extracted a list
 * of all videos he watched but he was unable to sum their durations
 * because they were in format hours:minutes. Write a program to help
 * Peter sum the durations of the videos he watched and print them in
 * format hours:minutes (where minutes should be in the range 0...59).
 */
public class VideoDuration {
        public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        List<Integer> hours = new ArrayList<Integer>();
        List<Integer> minutes = new ArrayList<>();
        String[] random = input.split(":");
        hours.add(Integer.parseInt(random[0]));
        minutes.add(Integer.parseInt(random[1]));
        boolean IsGood = true;
        while(IsGood==true){
            input = console.nextLine();
            if(input.equals("End")){
                IsGood= false;
                break;
            }
            String[] input2= input.split(":");
            hours.add(Integer.parseInt(input2[0]));
            minutes.add(Integer.parseInt(input2[1]));
        }
        int counter = 0;
        int sumMinute=0;
            for (Integer minute : minutes) {
                sumMinute+=minute;
            }
        int sumHours=0;
            for (Integer hour : hours) {
                sumHours+=hour;
            }

        sumHours += sumMinute/60;
        sumMinute=sumMinute%60;
            if(sumMinute<10){
                System.out.println(sumHours + ":" + "0" + sumMinute);
            }
            else{
                System.out.println(sumHours + ":" + sumMinute);
            }



    }
}
