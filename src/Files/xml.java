package Files;

public class xml implements file{
    @Override
    public void read(String file_name)
    {
        System.out.println("Reading xml");
    }
    @Override
    public void write(String path) {
        System.out.println("Writing xml");
    }
}
