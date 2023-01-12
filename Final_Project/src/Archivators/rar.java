package Archivators;

public class rar implements archive{
    @Override
    public void read(String file_name)
    {
        System.out.println("Reading rar");
    }
    @Override
    public void write(String path)
    {
        System.out.println("Writing rar");
    }
}
