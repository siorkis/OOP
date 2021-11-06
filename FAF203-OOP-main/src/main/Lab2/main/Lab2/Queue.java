package main.Lab2;

class Node<T> {

    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }
}

public class Queue<T> {

    Node<T> head;
    Node<T> tail;

    int size;
    int maxSize;

    public Queue() {
        this.size = 0;
        this.maxSize = Integer.MAX_VALUE;
        this.head = this.tail = null;
    }

    public Queue(Integer maxSize) {
        this.size = 0;
        this.maxSize = maxSize;
        this.head = this.tail = null;
    }

    public void add(T element) throws Exception {

        if (this.size == this.maxSize) {
            throw new Exception("The queue is full");
        } else {
            Node<T> node = new Node<T>(element);

            if (this.size == 0) {
                this.head = this.tail = node;
            } else {
                this.tail.next = node;
                this.tail = this.tail.next;
            }

            this.size++;
        }
    }

    public T pop() throws Exception {

        if (this.size == 0) {
            throw new Exception("The queue is empty");
        }

        Node<T> node = this.head;
        this.head = this.head.next;

        this.size--;

        if (this.size == 0) {
            this.tail = null;
        }

        return node.value;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int getLength() {
        return this.size;
    }

    public boolean isFull() {
        if (this.maxSize == Integer.MAX_VALUE) {
            System.out.println("The queue is never full!");
            return false;
        } else {
            System.out.println("The queue has: " + this.size + " elements.");
            return true;
        }
    }
}

