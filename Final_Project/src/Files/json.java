package Files;

public class json implements file{
    @Override
    public void read()
    {
        System.out.println("Reading json");
    }
    @Override
    public void write() {
        System.out.println("Writing json");
    }
}
