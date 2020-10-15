package model;

public class Visa extends Card {

    public double debtLimit;

    public Visa() {
        super();
    }

    @Override
    public boolean transferFund(Card cardReceive, double amount) {
        System.out.println("Visa card cannot transfer");
        return false;
    }

    @Override
    public boolean withdrawFund(double amount) {
        if (this.debtLimit + debtLimit > amount) {
            return super.withdrawFund(amount);
        } else {
            return false;
        }
    }
}
