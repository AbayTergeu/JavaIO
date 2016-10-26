package examples.file;

import java.io.*;

/**
 * ##### Assign file content into a variable
 * Created by tergeusizov on 10/26/2016.
 */
public class AssignDataInVariableExample {
    public static void main(String[] args){
        File file = new File("c:\\Temp\\b\\afile.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            DataInputStream dis = new DataInputStream(fis);

            byte[] dataInBytes = new byte[dis.available()];
            dis.readFully(dataInBytes);
            dis.close();

            String content = new String(dataInBytes, 0, dataInBytes.length);
            System.out.println("content: " + content);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
