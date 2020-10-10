public class Room {
    String id;
    String name;
    double area;
    int numOfPeople;
    double price;
    boolean isAvailable;

    public Room(String id, String name, double area, int numOfPeople, double price, boolean isAvailable) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.numOfPeople = numOfPeople;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void view() {

    }

    public Room update(Double area, int numOfPeople, boolean isAvailable) {
        setArea(area);
        setNumOfPeople(numOfPeople);
        setAvailable(isAvailable);
        return this;
    }
}
