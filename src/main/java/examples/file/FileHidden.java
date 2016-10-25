package examples.file;

import java.io.File;

/**
 * ##### check if a file is hidden
 * Created by tergeusizov on 10/25/2016.
 */
public class FileHidden {
    public static void main(String[] args){
        File file = new File("c:\\Temp\\lines.txt");

        if(file.isHidden()){
            System.out.println("File is hidden!");
        }else{
            System.out.println("File is not hidden!");
        }
    }
}
