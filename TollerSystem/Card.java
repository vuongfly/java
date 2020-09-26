public class Card extends Ticket {
    private double balance;

    public Card() {
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    

}
