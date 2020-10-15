package model;

public class Visa extends Card {

    double debtLimit;

    public Visa() {
    }

    public double getDebtLimit() {
        return debtLimit;
    }

    public void setDebtLimit(double debtLimit) {
        this.debtLimit = debtLimit;
    }
}
