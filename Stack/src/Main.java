import Storage.Array;
import Storage.LinkedList;
import Storage.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.setStack(new Array());
        stack.push(2);
        stack.pop();

        stack.setStack(new LinkedList());
        stack.push(2);
        stack.pop();


//        try {
//            // phong doan
//            int c = Integer.parseInt(null);
//            int a = 7 / c;
//            a++;
//        } catch (ArithmeticException e) {
//            // xu ly
//            System.out.println("Loi toan hoc");
//            System.out.println(e.getMessage());
//        } catch (NumberFormatException ex){
//            System.out.println("error "+ex.getMessage());
////            throw ex;
//        }
//        finally {
//            System.out.println("Done!");
//        }

    }
}