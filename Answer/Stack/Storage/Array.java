package Storage;

public class Array extends Storage {
    @Override
    public void push(int data) {
        System.out.println("Array push!");
    }

    @Override
    public int pop() {
        System.out.println("Array pop");
        return 0;
    }
}
