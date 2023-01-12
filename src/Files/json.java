package Files;

public class json implements file{
    @Override
    public void read(String file_name)
    {
        System.out.println("Reading json");
    }
    @Override
    public void write(String path) {
        System.out.println("Writing json");
    }
}
