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
}
