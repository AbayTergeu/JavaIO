package examples.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ### Append data in exists file
 * Created by tergeusizov on 10/12/2016.
 */
public class AppendToFileExample {
    public static void main(String[] args){
        try {
            String content = "This is new data for add in exists file";
            File file = new File("C:\\Temp\\testing.txt");

            if(!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
