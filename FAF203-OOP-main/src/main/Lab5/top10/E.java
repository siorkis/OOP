package Lab5.top10;

public class E extends D
{
    public String e;

    public E(String val, X x)
    {
        super(val, x);
        e = "E: " + val;
    }

    public void printState()
    {
        System.out.println("Current state: " + e);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}