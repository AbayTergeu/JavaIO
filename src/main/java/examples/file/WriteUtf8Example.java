package examples.file;

import java.io.*;

/**
 * ##### Write UTF-8 encoded data into a file
 * Created by tergeusizov on 10/26/2016.
 */
public class WriteUtf8Example {
    public static void main(String[] args){
        File file = new File("c:\\Temp\\b\\afile.txt");

        try {
            FileOutputStream fos = new FileOutputStream(file);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF8");

            Writer writer = new BufferedWriter(osw);

            writer.append("???????? ?????").append("\r\n");
            writer.flush();

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
