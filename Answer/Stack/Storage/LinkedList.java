package Storage;

public class LinkedList extends Storage {
    @Override
    public void push(int data) {
        System.out.println("LinkedList push");
    }

    @Override
    public int pop() {
        System.out.println("LinkedList pop");
        return 0;
    }
}
