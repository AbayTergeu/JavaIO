package examples.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * ### Delete files with certain extension only
 * Created by tergeusizov on 10/12/2016.
 */
public class FileChecker {
    private static final String FILE_DIR = "C:\\Temp";
    private static final String FILE_EXT = ".txt";

    public static void main(String[] args){
        new FileChecker().deleteFile(FILE_DIR, FILE_EXT);
    }

    private void deleteFile(String folder, String ext){
        GenericExtFilter genericExtFilter = new GenericExtFilter(ext);
        File dir = new File(folder);

        String[] list = dir.list(genericExtFilter);
        if(list.length == 0){
            return;
        }

        File fileDelete;
        for(String file: list){
            String deleteFilePath = new StringBuffer(FILE_DIR).append(File.separator).append(file).toString();
            fileDelete = new File(deleteFilePath);
            boolean isDeleted = fileDelete.delete();
            System.out.println("file: " + deleteFilePath + " is deleted: " + isDeleted);
        }
    }

    public class GenericExtFilter implements FilenameFilter{

        private String ext;

        public GenericExtFilter(String ext){
            this.ext = ext;
        }

        public boolean accept(File dir, String name) {
            return (name.endsWith(ext));
        }
    }
}
