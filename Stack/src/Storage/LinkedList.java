package Storage;

public class LinkedList extends Storage {
    @Override
    public void push(int data) {
        System.out.println("Push");
    }

    @Override
    public int pop() {
        System.out.println("Pop");
        return 0;
    }
}
