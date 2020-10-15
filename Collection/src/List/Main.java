package List;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.add(new Node(10, null));
        list.add(new Node(20, null));
        list.add(new Node(30, null));
        System.out.println(list.toString());
    }
}
