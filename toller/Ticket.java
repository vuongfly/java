package vn.techmaster.toller;

public abstract class Ticket {
    private Gate origin = null;
    private boolean isValid;
    private double value;

    public Ticket(double value) {
        setValue(value);
        setValid(true);
    }

    public void setOrigin(Gate gate) {
        origin = gate;
    }

    public Gate getOrigin() {
        return origin;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        this.isValid = valid;
    }

    protected void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public void adjustValue(double value) {
        System.out.println("Do not support this method");
    }

    public abstract void updateValid();

    @Override
    public String toString() {
        return "Gate: " + (origin != null ? origin.getName() : "");
    }
}
