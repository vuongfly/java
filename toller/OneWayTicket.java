package vn.techmaster.toller;

public class OneWayTicket extends Ticket {

    public OneWayTicket(double value, Gate origin) {
        super(value);
        setOrigin(origin);
    }


    @Override
    public void updateValid() {
        setValid(false);
    }

    @Override
    public String toString() {
        return super.toString() + "\nOne way ticket status: " + super.isValid();
    }
}
