import Sortable.*;

public class Main {
    public static void main(String[] args) {
        String[] arrStr = {"abfj","ongd", "yskdjfn", "baskjdo", "eoknsns" };
        ISort sort = new SelectionSort();
        Company com = new Company(sort);
        com.sort();
    }
}
