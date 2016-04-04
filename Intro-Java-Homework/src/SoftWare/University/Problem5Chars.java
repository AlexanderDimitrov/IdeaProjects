package SoftWare.University;
import java.util.Scanner;

/**
 * Created by iLuvEvz on 16.3.2016 г..
 */
public class Problem5Chars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input = console.nextByte();

        int counter = 1;
        for (int i = 0; i < input; i++) {
            char a = 'a';
            for (int j = 0; j < counter; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
            counter ++;
        }
        int secCounter = counter -2;
        for (int i = 0; i <input-1 ; i++) {
            char a = 'a';
            for (int j = 0; j <secCounter ; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
            secCounter--;
        }
    }
}
