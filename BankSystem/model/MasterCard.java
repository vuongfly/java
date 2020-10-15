package model;

public class MasterCard extends Card {
    public double interestRate = 0.03;

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public MasterCard() {
        super();
    }

    public void monthlyInterest() {
        this.balance += this.balance * this.interestRate;
    }
}
