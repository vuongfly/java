import Storage.Array;
import Storage.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.setStack(new Array());
        stack.push(2);
        stack.pop();
    }
}