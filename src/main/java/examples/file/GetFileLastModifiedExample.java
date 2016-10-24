package examples.file;

import java.io.File;
import java.text.SimpleDateFormat;

/**
 * ##### Get the file last modified date
 * Created by tergeusizov on 10/24/2016.
 */
public class GetFileLastModifiedExample {
    public static void main(String[] args){
        File file = new File("c:\\Temp\\b\\afile.txt");
        System.out.println("Before format: " + file.lastModified());

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY HH:mm:ss");
        System.out.println("After format: " + sdf.format(file.lastModified()));
    }
}
