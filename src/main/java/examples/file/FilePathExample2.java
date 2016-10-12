package examples.file;

import java.io.File;
import java.io.IOException;

/**
 * Created by tergeusizov on 10/11/2016.
 */
public class FilePathExample2 {
    public static void main(String[] args){
        try{
            String filename = "newfile3.txt";
            String workingDirectory = System.getProperty("user.dir");
            File file = new File(workingDirectory, filename);

            System.out.println("AbsolutePath = " + file.getAbsolutePath());
            if(file.createNewFile()){
                System.out.println("File is created!");
            }else{
                System.out.println("File is already exists!");
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
