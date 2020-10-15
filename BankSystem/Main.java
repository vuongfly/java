import model.Card;
import model.User;
import model.Visa;

public class Main {
    public static void main(String[] args) {
        User user = new User("Vuong Fly");
        Card visa = new Visa();
        visa.setCardNumber("5554");
        user.setCard(visa);
        System.out.println(user.toString());
    }
}
