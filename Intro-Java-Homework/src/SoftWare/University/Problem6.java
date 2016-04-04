package SoftWare.University;

import java.util.Scanner;

/**
 * Created by iLuvEvz on 16.3.2016 г..
 */
public class Problem6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input = console.nextInt();
        int sum = 0;
        for (int i = 0; i <=input ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
