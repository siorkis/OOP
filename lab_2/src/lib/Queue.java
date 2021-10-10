package lib;

import java.util.ArrayList;

public class Queue<T> {

    int limit = Integer.MAX_VALUE;
    int state = 0;
    ArrayList<T> memory = new ArrayList<>();

    public Queue() {

    }

    public Queue(int max) {
        limit = max;
    }

    public void push(T value) {
        if (state < limit) {
            memory.add(value);
            state++;
        } else {
            System.out.println("Error, maximum size reached");
        }
    }

    public T pop() {
        if (state > 0) {
            T temp = memory.get(0);
            memory.remove(0);
            state--;
            return temp;
        } else {
            System.out.println("Error, queue empty");
            return null;
        }
    }

    public boolean checkFull() {
        return state == limit;
    }

    public boolean checkEmpty(){
        return state == 0;
    }

}
