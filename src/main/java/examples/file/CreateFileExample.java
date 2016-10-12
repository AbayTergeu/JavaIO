package examples.file;

import java.io.File;
import java.io.IOException;

/**
 * ### Create file
 * Created by tergeusizov on 10/11/2016.
 */
public class CreateFileExample {
    public static void main(String[] args){
        try {
            File file = new File("C:\\Temp\\newfile.txt");
            if(file.createNewFile()){
                System.out.println("File is created!");
            }else{
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
