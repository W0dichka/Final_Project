package Files;

public class xml implements file{
    @Override
    public void read()
    {
        System.out.println("Reading xml");
    }
    @Override
    public void write() {
        System.out.println("Writing xml");
    }
}
