package Files;

public class rar implements file{
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
