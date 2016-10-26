package examples.file;

import java.io.*;

/**
 * ##### read UTF-8 encoded data from a file
 * Created by tergeusizov on 10/26/2016.
 */
public class ReadUtf8Example {
    public static void main(String[] args){
        File file = new File("c:\\Temp\\b\\afile.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, "UTF8");
            BufferedReader br = new BufferedReader(isr);

            String str;

            while ((str = br.readLine()) != null){
                System.out.println(str);
            }

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
