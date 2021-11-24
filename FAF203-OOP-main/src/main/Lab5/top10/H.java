package Lab5.top10;

public class H extends G
{
    protected String h;

    public H(String val, X x)
    {
        super(val, x);
        h = "H: " + val;
    }

    public void printState()
    {
        System.out.println("Current state: " + h);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}