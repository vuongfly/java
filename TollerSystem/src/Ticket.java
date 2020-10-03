package src;

/**
 * Ticket
 */
public abstract class Ticket {

    private double value;
    private String id;
    private boolean isActive;

    public Ticket() {
    }

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean isActive() {
        return this.isActive;
    }

    private void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void active() {
        this.setIsActive(true);
    }

    public void deActive() {
        this.setIsActive(false);
    }

    public String getId() {
        return this.id;
    }

}