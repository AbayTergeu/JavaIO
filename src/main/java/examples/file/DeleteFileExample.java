package examples.file;

import java.io.File;

/**
 * ### Delete file
 * Created by tergeusizov on 10/12/2016.
 */
public class DeleteFileExample {
    public static void main(String[] args){
        try {
            File file = new File("C:\\Temp\\testing.txt");

            if (file.delete()) {
                System.out.println(file.getName() + " is deleted!");
            } else {
                System.out.println("Delete operation is failed!");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
