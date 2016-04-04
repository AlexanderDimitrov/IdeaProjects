package SoftwareUniversity;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Freeware Sys on 3/28/2016.
 */
public class Problem6 {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("out/production/course.save"));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("out/production/course.save"));
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        os.writeObject(input);
        System.out.println(ois.readObject().toString());

    }
}
