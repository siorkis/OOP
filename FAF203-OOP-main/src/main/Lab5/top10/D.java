package Lab5.top10;

public class D extends C
{
    protected String d;

    public D(String val, X x)
    {
        super(val, x);
        d = "D: " + val;
    }

    public void printState()
    {
        System.out.println("Current state: " + d);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}