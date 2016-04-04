package SoftwareUniversity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * Created by Freeware Sys on 3/28/2016.
 */
public class Problem4{
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/SoftwareUniversity/TextFiles/DSC05117.jpg");
        FileOutputStream fos = new FileOutputStream("out/production/my-copied-picture.jpg");
        int byteCounter = 0;
        while((byteCounter = fis.read())!=-1){
            fos.write(byteCounter);
        }
        fos.close();
        fis.close();
    }
}
