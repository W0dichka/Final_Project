package Files;

public class txt implements file{
    @Override
    public void read(String file_name)
    {
        System.out.println("Reading txt");
    }
    @Override
    public void write(String path) {
        System.out.println("Writing txt");
    }
}
