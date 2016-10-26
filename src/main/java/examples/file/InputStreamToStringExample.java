package examples.file;

import java.io.*;

/**
 * ##### Convert InputStream to String
 * Created by tergeusizov on 10/26/2016.
 */
public class InputStreamToStringExample {
    public static void main(String[] args){
        String txt = "test message!";
        InputStream is = new ByteArrayInputStream(txt.getBytes());

        String result = getStringFromInputStream(is);
        System.out.println("result: " + result);
        System.out.println("Done");
    }

    private static String getStringFromInputStream(InputStream is){
        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        }catch(IOException e){
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
        return sb.toString();
    }
}
