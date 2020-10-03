package Answer.toller;

public abstract class Ticket {
    private Gate origin = null;
    private boolean valid;
    private int value;

    public Ticket(int value){
        setValid(true);
        setValue(value);
    }

    protected void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void adjustValue(int value){
        System.out.println("Do not support this method");
    }

    public void setOrigin(Gate gate) {
        origin = gate;
    }

    public Gate getOrigin() {
        return origin;
    }

    public boolean isValid(){
        return this.valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public abstract void updateValid();

    @Override
    public String toString() {
        return "Gate: " + (origin != null ? origin.getName() : "");
    }
}
