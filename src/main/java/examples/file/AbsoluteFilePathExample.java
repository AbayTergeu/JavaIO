package examples.file;

import java.io.File;
import java.io.IOException;

/**
 * ##### Get the filepath of a file
 * Created by tergeusizov on 10/24/2016.
 */
public class AbsoluteFilePathExample {
    public static void main(String[] args){
        try {
            File temp = File.createTempFile("testTempFile", ".tmp");

            String absolutePath = temp.getAbsolutePath();
            System.out.println("absolutePath: " + absolutePath);

            String filePath = absolutePath.substring(0, absolutePath.lastIndexOf(File.separator));
            System.out.println("filePath: " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
