package SoftwareUniversity;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Freeware Sys on 3/28/2016.
 */
public class Problem5 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("out/production/Problem5DoublesList.txt"));
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(44.15);
        doubles.add(44.60);
        doubles.add(46.80);
        oos.writeObject(doubles);
        oos.flush();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("out/production/Problem5DoublesList.txt"));
        System.out.println(ois.readObject());
        ois.close();
    }
}
