package examples.file;

import java.io.File;
import java.io.IOException;

/**
 * Created by tergeusizov on 10/11/2016.
 */
public class FilePermissionExample {
    public static void main(String[] args){
        try {
            File file = new File("C:\\Temp\\newFile.txt");

            if (file.exists()) {
                System.out.println("Is execute allow: " + file.canExecute());
                System.out.println("Is write allow: " + file.canWrite());
                System.out.println("Is read allow: " + file.canRead());
            }

            file.setExecutable(false);
            file.setReadable(false);
            file.setWritable(false);

            System.out.println("Is execute allow: " + file.canExecute());
            System.out.println("Is write allow: " + file.canWrite());
            System.out.println("Is read allow: " + file.canRead());

            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File already exists.");
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
