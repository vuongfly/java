package Answer.toller;

import Answer.toller.Line;

public class Gate {
    private String name; //unique
    //TODO:
    private int distance;

    public Gate(String name, int distance) {
        setName(name);
        setDistance(distance);
    }

    private void setName(String name) {
        this.name = name;
    }

    public void setDistance(int distance){
        this.distance = distance;
    }

    public void enter(Ticket ticket) {
        if (ticket.isValid()) {
            open();
            ticket.setOrigin(this);
        }
        else {
            close();
        }
    }

    public void exit(Ticket ticket) {
        Gate origin = ticket.getOrigin();
        if (origin != null) {
            // TODO:
            int d = Math.abs(distance - origin.distance);
            int fare = Line.getFare(d);
            if (ticket.getValue() > fare) {
                ticket.adjustValue(-fare);
                ticket.setOrigin(null);
                ticket.updateValid();
                open();
            } else {
                System.out.println("Fare: " + fare + " & " + ticket.toString());
                close();
            }
        } else {
            close();
        }
    }

    public void open() {
        System.out.println("Gate " + name + " is opened");
    }

    public void close() {
        System.out.println("Gate " + name + " is closed");
    }

    public String getName() {
        return name;
    }
}
