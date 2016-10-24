package examples.file;

import java.io.File;

/**
 * ##### Make a file read only
 * Created by tergeusizov on 10/24/2016.
 */
public class FileReadAttribute {
    public static void main(String[] args){
        File file = new File("c:\\Temp\\b\\afile.txt");
        file.setReadOnly();

        if(file.canWrite()){
            System.out.println("This file is writable!");
        }else{
            System.out.println("This file is read only!");
        }

        file.setWritable(true);

        if(file.canWrite()){
            System.out.println("This file is writable!");
        }else{
            System.out.println("This file is read only!");
        }

    }
}
