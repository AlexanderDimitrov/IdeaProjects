package SoftWare.University;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by iLuvEvz on 23.3.2016 г..
 */
public class Problem7 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        Random random = new Random(a);
        if (a > b) {
            for (int i = b; i <= a; i++) {
                System.out.print(random.nextInt(b) + b +" ");
            }
        }
        else{
        for (int i = a; i <= b; i++) {
                System.out.print(random.nextInt(a) + a +" ");
            }
        }
    }
}
