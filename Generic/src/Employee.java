public class Employee implements Comparable<Employee> {
    private String id;
    private String name;

    public Employee() {
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee e) {
        // Compare base on ID:
        return this.getId().compareTo(e.getId());

//        // Compare base on ID + name:
//        if (this.getName().compareTo(e.getName()) != 0){
//            return this.getName().compareTo(e.getName());
//        } else {
//            return this.getId().compareTo(e.getId());
//        }

    }


}
