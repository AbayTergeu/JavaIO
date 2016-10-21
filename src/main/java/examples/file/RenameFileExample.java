package examples.file;

import java.io.File;

/**
 * ##### Rename file
 * Created by tergeusizov on 10/21/2016.
 */
public class RenameFileExample {
    public static void main(String[] args){
        File oldFile = new File("c:\\Temp\\test.jpg");
        File newFile = new File("c:\\Temp\\testnew.jpg");

        if(oldFile.renameTo(newFile)){
            System.out.println("Rename successful!");
        }else{
            System.out.println("Rename failed!");
        }
    }
}
