package SoftwareUniversity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by Freeware Sys on 3/28/2016.
 */
public class Problem7 {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("src/SoftwareUniversity/TextFiles/words.txt");
        ZipOutputStream zipOS = new ZipOutputStream(new FileOutputStream("out/production/text-files.zip"));
        int byteContainer = 0;
        zipOS.putNextEntry(new ZipEntry("src/SoftwareUniversity/TextFiles/words.txt"));
        while((byteContainer = fis.read())!=-1){
            zipOS.write(byteContainer);
        }
        zipOS.closeEntry();
        zipOS.putNextEntry(new ZipEntry("src/SoftwareUniversity/TextFiles/count-chars.txt"));
        while((byteContainer = fis.read())!=-1){
            zipOS.write(byteContainer);
        }
        zipOS.closeEntry();
        zipOS.putNextEntry(new ZipEntry("src/SoftwareUniversity/TextFiles/lines.txt"));
        while((byteContainer = fis.read())!=-1){
            zipOS.write(byteContainer);
        }
        zipOS.closeEntry();
        zipOS.finish();
        zipOS.close();
    }
}
