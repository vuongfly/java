package controller;

import model.MasterCard;

public class MasterCardController {
    MasterCard masterCard;

    public void monthlyInterest() {
        masterCard.addBalance(masterCard.getBalance() * masterCard.getInterestRate());
    }
}
