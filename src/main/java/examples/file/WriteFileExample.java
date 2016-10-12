package examples.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ### Write to file
 * Created by tergeusizov on 10/12/2016.
 */
public class WriteFileExample {
    public static void main(String[] args){
        FileOutputStream fos = null;
        File file;
        String content = "This is the text content";
        try{
            file = new File("C:\\Temp\\testing.txt");
            fos = new FileOutputStream(file);

            if(!file.exists()){
                file.createNewFile();
            }

            byte[] contentInBytes = content.getBytes();

            fos.write(contentInBytes);
            fos.flush();
            fos.close();

            System.out.println("Done");
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
