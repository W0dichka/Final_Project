import Archivators.ArchiveType;
import Archivators.archive;
import Factories.ArchiveFactory;

import java.util.Scanner;

public class Main
{
    private static final String txt_to_zip = "test_2.txt";
    private static final String zip_to_txt = "test_1.zip";

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        ArchiveFactory factory = new ArchiveFactory();
        archive zip = factory.getArchive(ArchiveType.zip);
        zip.read(zip_to_txt);
    }
}