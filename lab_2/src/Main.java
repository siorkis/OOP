import lib.Box;
import lib.Queue;

public class Main {

    public static void testBox() {
        Box box1 = new Box();
        Box box2 = new Box(14);
        Box box3 = new Box(3, 4, 5);

        System.out.println("The box area is " + box3.getArea());
        System.out.println("The box volume is " + box3.getVolume());
    }

    public static void testQueue() {
        Queue queue1 = new Queue();
        Queue queue2 = new Queue(3);

        queue1.push(1);
        queue1.push(5);
        queue1.push(7);

        queue2.push('a');
        queue2.push('n');
        queue2.push('q');

        for (int i = 0; i < 2; i++) {
            queue1.pop();
        }

        for (int i = 0; i < 2; i++) {
            queue2.pop();
        }

        System.out.println("Queue 1: " + queue1.pop());
        System.out.println("Queue 2: " + queue2.pop());

        if (queue1.checkFull())
            System.out.println("The first queue is full");
        else
            System.out.println("The first queue is NOT full");

        if (queue2.checkEmpty())
            System.out.println("The second queue is empty");
        else
            System.out.println("The first queue is NOT empty");

    }

    public static void main(String[] args) {
        testBox();
        testQueue();
    }

}
