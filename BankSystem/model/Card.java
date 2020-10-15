package model;

public class Card {
    double balance = 0;
    public Card card;
    String cardNumber;

    public Card() {
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "Card{" +
                "balance=" + balance +
                ", cardNumber='" + cardNumber + '\'' +
                '}';
    }

    public boolean addBalance(double amount) {
        this.balance += amount;
        return true;
    }

    public boolean subBalance(double amount) {
        if (balance < amount) {
            System.out.println("cannot withdraw amount bigger than balance");
        } else {
            this.balance -= amount;
        }
        return true;
    }



}
