package Answer.DemoException;

public class Demo {

    public static void f1(int a) {
        if (a == 0) {
            throw new NullPointerException("f1 get null arg");
        }
    }

    public static void f2(int a) {
        try {
            f1(a);
        }
        catch (NullPointerException e) {
            throw new NullPointerException("f2 get null arg");
        }
    }

    public static void f3() {
        int a = 0;
        try {
            f2(a);
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("Handle null arg");
            a ++;
        }
    }

    public static void main(String[] args) {
        f3();
    }
}
