package Answer.toller;

public class PrepaidCard extends Ticket {

    public PrepaidCard(int value) {
        super(value);
    }

    @Override
    public void adjustValue(int value) {
        setValue(getValue() + value);
    }

    @Override
    public boolean isValid() {
        return getValue() > 0;
    }

    @Override
    public void updateValid() {
        if (isValid()) {
            setValid(true);
        }
        setValid(false);
    }

}
