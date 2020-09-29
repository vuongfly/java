package Storage;

public class Array extends Storage {
    @Override
    public void push(int data) {
        System.out.println("Array Push");
    }

    @Override
    public int pop() {
        System.out.println("Array Pop");
        return 0;
    }
}
