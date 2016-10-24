package examples.file;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ##### Change the file last modified date
 * Created by tergeusizov on 10/24/2016.
 */
public class ChangeFileLastModifiedExample {
    public static void main(String[] args){
        File file = new File("c:\\Temp\\b\\afile.txt");
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Original last modified file date; " + sdf.format(file.lastModified()));
        String newDate = "03/09/1984";
        Date date = null;
        try {
            date = sdf.parse(newDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        file.setLastModified(date.getTime());

        System.out.println("Lastest Last modified date: " + sdf.format(file.lastModified()));

    }
}
