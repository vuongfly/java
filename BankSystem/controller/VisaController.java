package controller;

import model.Card;
import model.Visa;

public class VisaController extends CardController{
    Visa visa;

    public VisaController(Visa visa) {
        this.visa = visa;
    }

    @Override
    public boolean depositFund(double amount) {
        return super.depositFund(amount);
    }

    @Override
    public boolean withdrawFund(double amount) {
        if (visa.getBalance() + visa.getDebtLimit() > amount){
            return super.withdrawFund(amount);
        } else {
            return false;
        }
    }

    @Override
    public boolean transferFund(Card card, double amount) {
        System.out.println("Visa cannot transfer money");
        return false;
    }
}
