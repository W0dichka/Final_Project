package Archivators;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class zip implements archive {
    @Override
    public void read(String file_name) {
        String zipname = file_name.replace("txt", "zip");

        try(ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(zipname));
            FileInputStream fis = new FileInputStream(file_name);)
        {
            ZipEntry entry1 = new ZipEntry("notes.txt");
            zout.putNextEntry(entry1);
            // считываем содержимое файла в массив byte
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            // добавляем содержимое к архиву
            zout.write(buffer);
            // закрываем текущую запись для новой записи
            zout.closeEntry();
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
    @Override
    public void write(String path) {
        try(ZipInputStream zis = new ZipInputStream(new FileInputStream(path)))
        {
            ZipEntry entry;
            String name;
            long size;

            while((entry = zis.getNextEntry()) != null){

                name = entry.getName();
                size = entry.getSize();

                System.out.printf("File name: %s \t File size: %d \n", name, size);

                FileOutputStream fout = new FileOutputStream(name);

                for (int c = zis.read(); c != -1; c = zis.read())
                    fout.write(c);

                fout.flush();
                zis.closeEntry();
                fout.close();
            }
        }

        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
