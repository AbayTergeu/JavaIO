package examples.file;

import java.io.*;

/**
 * ##### Convert String to InputStream
 * Created by tergeusizov on 10/26/2016.
 */
public class StringToInputStreamExample {
    public static void main(String[] args){
        String str = "Test message!";
        InputStream is = new ByteArrayInputStream(str.getBytes());
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String txt = null;
        try {
            while ((txt = br.readLine()) != null){
                System.out.println("txt: " + txt);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Done");

    }
}
