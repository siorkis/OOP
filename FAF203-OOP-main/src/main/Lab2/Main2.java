import main.Lab2.Box;
import main.Lab2.Queue;

public class Main2 {

    public static void main(String []args) throws Exception {

        Box Box1 = new Box();
        System.out.println(Box1.toString());
        System.out.println("Area: " + Box1.Area());
        System.out.println("Volume: " + Box1.Volume());


        Box Box2 = new Box(25);
        System.out.println(Box2.toString());
        System.out.println("Area: " + Box2.Area());
        System.out.println("Volume: " + Box2.Volume());


        Box Box3 = new Box(10, 15, 20);
        System.out.println(Box3.toString());
        System.out.println("Area: " + Box3.Area());
        System.out.println("Volume: " + Box3.Volume());

        Queue<Integer> q1 = new Queue<Integer>(4);
        Queue<String> q2 = new Queue<String>();

        q1.add(0);
        q1.add(10);
        q1.add(100);
        q1.add(1000);

        boolean q1Length = q1.isFull();
        System.out.println(q1.pop());
        System.out.println(q1.pop());

        q2.add("Beluga");
        q2.add("Hecker");
        q2.add("Skittle");
        q2.add("Lester");

        boolean q2Length = q2.isFull();
        System.out.println(q2.pop());
        System.out.println(q2.pop());
    }

}
