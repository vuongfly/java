import Sortable.*;

public class Company {
    String[] employeeIds;
    ISort sort;
    public Company (ISort sort){
        this.sort = sort;
    }

    public void sort(){
        sort.sort(employeeIds);
    }

    public void setSort(ISort sort){
        this.sort = sort;
    }

}
