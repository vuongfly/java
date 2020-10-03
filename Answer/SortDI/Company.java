import Sortable.Sortable;

public class Company {
    String[] employeeIds;
    Sortable sort;

    public Company(Sortable sort) {
        this.employeeIds = new String[]{"hello", "world"};
        this.sort = sort;
    }

    public void setSort(Sortable sort) {
        this.sort = sort;
    }

    public void demoMethod(Sortable sort, boolean isValid) {
        if (isValid) {

        }
        else {

        }
        this.sort = sort;
    }

    public void sort() {
        sort.sort(employeeIds);
    }
}
