import Sortable.Sortable;

public class Company {
    Sortable sort;
    String[] employeeIds;

    public Company(Sortable sort){
        this.sort = sort;
        this.employeeIds = new String[]{"hello", "world"};
    }

    public void setSort(Sortable sort) {
        this.sort = sort;
    }

    public void sort(){
        sort.sort(employeeIds);
    }
}
