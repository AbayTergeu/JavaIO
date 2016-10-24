package examples.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * ##### Get the file creation date
 * Created by tergeusizov on 10/24/2016.
 */
public class GetFileCreationDateExample {
    public static void main(String[] args){
        try {
            Process process = Runtime.getRuntime().exec("cmd /c dir c:\\Temp\\b\\afile.txt /tc");
            BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String data = "";
            String line = null;

            while((line = br.readLine()) !=null ){
                if(line.indexOf("afile.txt")>0) {
                    data = line;
                }
            }

            System.out.println("Extract data: " + data);
            StringTokenizer st = new StringTokenizer(data);
            String date = st.nextToken();
            String time = st.nextToken() + " " + st.nextToken();

            System.out.println("date: " + date);
            System.out.println("time: " + time);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
