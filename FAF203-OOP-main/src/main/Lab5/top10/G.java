package Lab5.top10;

public class G extends F
{
    public String g;

    public G(String val, X x)
    {
        super(val, x);
        g = "G: " + val;
    }

    public void printState()
    {
        System.out.println("Current state: " + g);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}