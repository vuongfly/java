package Answer.toller;

public class OneWayTicket extends Ticket {

    public OneWayTicket(int value, Gate origin) {
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
