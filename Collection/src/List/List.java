package List;

public class List {
    Node head;

    public List(){
        head = null;
    }

    public void add(Node node){
        if (head == null){
            head = node;
        } else{
            Node temp = head;
            while (temp.getNext()!=null){
                temp = temp.getNext();
            }
            temp.setNext(node);
        }

    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node temp = head;
        while(temp != null){
            str.append(temp.getValue()).append(",");
            temp = temp.getNext();
        }
        return str.toString();
    }
}
