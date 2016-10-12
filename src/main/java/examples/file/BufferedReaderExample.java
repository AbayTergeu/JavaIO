package examples.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ### ### Read data in file
 * Created by tergeusizov on 10/12/2016.
 */
public class BufferedReaderExample {
    public static void main(String[] args){
        BufferedReader br = null;
        String currentLine = null;

        try {
            br = new BufferedReader(new FileReader("C:\\Temp\\testing.txt"));

            while((currentLine = br.readLine()) != null){
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(br != null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
