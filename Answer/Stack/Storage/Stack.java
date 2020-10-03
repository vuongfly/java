package Answer.Stack.Storage;

import Storage.Storage;

public class Stack {
    Storage storage;

    public void setStack(Storage storage){
        this.storage = storage;
    }

    public void push(int data){
        storage.push(data);
    }

    public int pop(){
        return storage.pop();
    }

}
