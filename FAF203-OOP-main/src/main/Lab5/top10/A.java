package Lab5.top10;

public class A {
    protected String a;
    protected X x = new X("xxx");

    public A(String val, X x)
    {
        a = "A: " + val;
        this.x = x;
    }

    public void printState()
    {
        System.out.println("Current state: " + a);
        System.out.println("Current state: " + x.getX());
    }
}
