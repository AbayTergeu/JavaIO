package examples.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * ##### Find files with certain extension only
 * Created by tergeusizov on 10/21/2016.
 */
public class FindCertainExtension {
    private static final String FILE_DIR = "c:\\Temp";
    private static final String FILE_TEXT_EXT = ".xml";

    public static void main(String[] args){
        FindCertainExtension findCertainExtension = new FindCertainExtension();
        findCertainExtension.listFile(FILE_DIR, FILE_TEXT_EXT);
    }

    public void listFile(String folder, String ext){
        GenericExtFilter genericExtFilter = new GenericExtFilter(ext);
        File dir = new File(folder);

        if(!dir.isDirectory()){
            System.out.println("Directory does not exists: " + folder);
        }

        String[] list = dir.list(genericExtFilter);

        if(list.length == 0){
            System.out.println("no files with extension: " + ext);
        }

        for(String file: list){
            String temp = new StringBuffer(FILE_DIR).append(File.separator).append(file).toString();
            System.out.println("file: " + temp);
        }
    }

    public class GenericExtFilter implements FilenameFilter{
        private String ext;
        public GenericExtFilter(String ext) {
            this.ext = ext;
        }

        public boolean accept(File dir, String name) {
            return (name.endsWith(ext));
        }
    }
}
