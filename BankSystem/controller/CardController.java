package controller;

import model.Card;

public class CardController {
    Card card;

    public CardController() {
    }

    public CardController(Card card) {
        this.card = card;
    }

    public boolean depositFund(double amount) {
        card.addBalance(amount);
        return true;
    }

    public boolean withdrawFund(double amount) {
        card.subBalance(amount);
        return true;
    }

    public boolean transferFund(Card cardReceive, double amount){
//        this.withdrawFund(amount);
//        cardReceive.addBalance(amount);
        return true;
    }

}
