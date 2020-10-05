import Sortable.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("SortDI Main");
        Sortable sort = new SelectionSort();
        Company company = new Company(sort);
        company.sort();
    }
}

