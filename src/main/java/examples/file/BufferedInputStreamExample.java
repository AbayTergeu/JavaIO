package examples.file;

import java.io.*;

/**
 * ### Read data in file
 * Created by tergeusizov on 10/12/2016.
 */
public class BufferedInputStreamExample {
    public static void main(String[] args){
        File file = new File("C:\\Temp\\testing.txt");
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        DataInputStream dis = null;

        try {
            fis = new FileInputStream(file);

            bis = new BufferedInputStream(fis);
            dis = new DataInputStream(bis);

            while(dis.available() != 0){
                System.out.println(dis.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fis.close();
                bis.close();
                dis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
