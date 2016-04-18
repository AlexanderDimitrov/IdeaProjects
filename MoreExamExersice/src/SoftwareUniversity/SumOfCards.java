package SoftwareUniversity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfCards {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        Pattern pattern = Pattern.compile("\\d+");
        List<Integer> list = new ArrayList<>();
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            list.add(Integer.parseInt(matcher.group()));
        }
        Pattern patern = Pattern.compile("([JQKA]{1})");
        Matcher ma = patern.matcher(input);
        List<String> strList = new ArrayList<>();
        while (ma.find()) {
            strList.add(ma.group());
        }
        for (String s : strList) {
            switch (s) {
                case "J":
                    list.add(12);
                    break;
                case "Q":
                    list.add(13);
                    break;
                case "K":
                    list.add(14);
                    break;
                case "A":
                    list.add(15);
                    break;
            }
        }
        int finalSum = 0;
        if (list.get(0) == list.get(1)) {
            finalSum += list.get(0) * 2;
        }
        else{
            finalSum+=list.get(0);
        }
        for (int j = 1; j < list.size() - 1; j++) {
            if (list.get(j - 1) == list.get(j) | list.get(j) == list.get(j + 1)) {
                finalSum += list.get(j) * 2;
            } else {
                finalSum += list.get(j);
            }
        }
        int counter = list.size()-1;
        if(list.get(counter)==list.get(counter-1)){
            finalSum+=list.get(counter)*2;
        }
        else{
            finalSum+=list.get(counter);
        }

        System.out.println(finalSum);
    }
}
