package examples.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * ##### Generate a file checksum value
 * Created by tergeusizov on 10/26/2016.
 */
public class TestCheckSum {
    public static void main(String[] args){

        File file = new File("c:\\Temp\\b\\afile.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            byte[] dataBytes = new byte[1024];

            int read = 0;
            while ((read = fis.read(dataBytes)) != -1){
                md.update(dataBytes, 0, read);
            }

            byte[] mdbytes = md.digest();

            StringBuffer sb = new StringBuffer("");
            for(int i = 0; i < mdbytes.length; i++){
                sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100,16 ).substring(1));
            }
            System.out.println("Digest in hex format: " + sb.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }
}
