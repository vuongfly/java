package src;

public class Gate {
    private String name;
    private String id;
    private boolean isOpen;

    public Gate() {
    }

    public Gate(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean getIsOpen() {
        return this.isOpen;
    }

    private void setIsOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public void open() {
        this.setIsOpen(true);
    }

    public void close() {
        this.setIsOpen(false);
    }

}
