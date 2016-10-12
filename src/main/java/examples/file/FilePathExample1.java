package examples.file;

import java.io.File;
import java.io.IOException;

/**
 * Created by tergeusizov on 10/11/2016.
 */
public class FilePathExample1 {
    public static void main(String[] args){
        try {
            String filename = "newFile2.txt";
            String workingDirectory = System.getProperty("user.dir");

            String absoluteFilePath = null;
            absoluteFilePath = workingDirectory + File.separator + filename;

            System.out.println("absoluteFilePath = " + absoluteFilePath);

            File file = new File(absoluteFilePath);

            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists!");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
