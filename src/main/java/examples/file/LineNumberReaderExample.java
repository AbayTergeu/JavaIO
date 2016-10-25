package examples.file;

import java.io.*;

/**
 * ##### Get the total number of lines of a file
 * Created by tergeusizov on 10/25/2016.
 */
public class LineNumberReaderExample {
    public static void main(String[] args){
        File file = new File("c:\\Temp\\lines.txt");
        if(file.exists()){
            try {
                FileReader fr = new FileReader(file);
                LineNumberReader lineNumberReader = new LineNumberReader(fr);

                int lineCount = 0;
                String line = null;
                while ((line=lineNumberReader.readLine()) != null){
                    System.out.println("line: " + line);
                    lineCount ++;
                }
                System.out.println("lineCount: " + lineCount);
                lineNumberReader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println("File does not exists!");
        }
    }
}
