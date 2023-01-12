import Factories.FileFactory;
import Files.*;

import java.util.Scanner;

public class Main
{
    private static final String txt_to_zip = "test_write.txt";
    private static final String zip_to_txt = "test_read.zip";

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        FileFactory factory = new FileFactory();
        file zip = factory.getFile(FileType.zip);
        zip.read(zip_to_txt);
        zip.write(txt_to_zip);

    }
}