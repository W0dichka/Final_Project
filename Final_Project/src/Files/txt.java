package Files;

public class txt implements file{
    @Override
    public void read()
    {
        System.out.println("Reading txt");
    }
    @Override
    public void write() {
        System.out.println("Writing txt");
    }
}
