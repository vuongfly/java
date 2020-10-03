package Answer.Stack;

import Storage.Array;
import Storage.LinkedList;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Answer.Stack.Storage.Stack stack = new Answer.Stack.Storage.Stack();
        stack.setStack(new LinkedList());
        stack.push(10);
        stack.pop();
    }
}
