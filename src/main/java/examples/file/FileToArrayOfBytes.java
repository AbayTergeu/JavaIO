package examples.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ##### Convert File into an array of bytes
 * Created by tergeusizov on 10/26/2016.
 */
public class FileToArrayOfBytes {
    public static void main(String[] args){
        File file = new File("c:\\Temp\\b\\afile.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] bFile = new byte[(int) file.length()];

            fis.read(bFile);
            fis.close();

            for(int i = 0; i < bFile.length; i++){
                System.out.print((char) bFile[i]);
            }

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
