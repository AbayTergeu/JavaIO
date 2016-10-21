package examples.file;

import java.io.*;

/**
 * ##### File copy
 * Created by tergeusizov on 10/21/2016.
 */
public class CopyFileExample {
    public static void main(String[] args){
        InputStream is = null;
        OutputStream os = null;

        try{
            File aFile = new File("c:\\Temp\\afile.txt");
            File bFile = new File("c:\\Temp\\bfile.txt");

            is = new FileInputStream(aFile);
            os = new FileOutputStream(bFile);

            byte[] buffer = new byte[1024];
            int length;

            while ((length = is.read(buffer))>0){
                os.write(buffer, 0, length);
            }

            is.close();
            os.close();

            System.out.println("File is copied successful!");

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
