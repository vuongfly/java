package Storage;

public class LinkedList extends Storage {
    @Override
    public void push(int data) {
        System.out.println("LinkedList Push");
    }

    @Override
    public int pop() {
        System.out.println("LinkedList Pop");
        return 0;
    }
}
