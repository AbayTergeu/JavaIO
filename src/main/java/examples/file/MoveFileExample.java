package examples.file;

import java.io.File;

/**
 * ##### To move file to another directory
 * Created by tergeusizov on 10/24/2016.
 */
public class MoveFileExample {
    public static void main(String[] args) {
        try {
            File file = new File("c:\\Temp\\a\\afile.txt");

            if (file.renameTo(new File("c:\\Temp\\b\\" + file.getName()))) {
                System.out.println("File is moved successful!");
            } else {
                System.out.println("File is failed to move!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
