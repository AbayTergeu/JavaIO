package examples.file;

import java.io.*;

/**
 * ##### Convert array of bytes into File
 * Created by tergeusizov on 10/26/2016.
 */
public class ArrayOfBytesToFile {
    public static void main(String[] args){
        File file = new File("c:\\Temp\\b\\afile.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            byte[] bFile = new byte[(int) file.length()];
            fis.read(bFile);
            fis.close();

            FileOutputStream fos = new FileOutputStream("c:\\Temp\\b\\afile2.txt");
            fos.write(bFile);
            fos.close();

            System.out.print("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
