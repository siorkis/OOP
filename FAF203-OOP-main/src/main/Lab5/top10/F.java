package Lab5.top10;

public class F extends E
{
    protected String f;

    public F(String val, X x)
    {
        super(val, x);
        f = "F: " + val;
    }

    public void printState()
    {
        System.out.println("Current state: " + f);
        System.out.println("Current state: " + x.getX());
        super.printState();
    }
}