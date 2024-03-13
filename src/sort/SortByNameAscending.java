package sort;

import java.util.Comparator;

public class SortByNameAscending implements Comparator<Product> {
    @Override
    public int compare(Product o, Product t1) {
        if (o != null && t1 != null) {
            return o.getName().compareTo(t1.getName());
        }
        return -1;
    }

}
