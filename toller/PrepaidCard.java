package toller;

public class PrepaidCard extends Ticket {

    public PrepaidCard(double value) {
        super(value);
    }

    @Override
    public void adjustValue(double value) {
        setValue(getValue() + value);
    }

    @Override
    public void updateValid() {
        if (getValue() < 0) {
            setValid(false);
        }
        else {
            setValid(true);
        }
    }
}
