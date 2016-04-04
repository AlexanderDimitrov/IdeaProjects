package SoftwareUniversity;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Freeware Sys on 3/30/2016.
 */
public class Problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine().toLowerCase();
        String stringToSearch = input.nextLine();

        Pattern stringPattern = Pattern.compile(stringToSearch);
        Matcher matcher = stringPattern.matcher(text);

        int count = 0;
        while (matcher.find()) {
            count++;
            int firstIndex = matcher.start();
            matcher.region(firstIndex + 1, text.length());
        }

        System.out.println(count);
    }
}
