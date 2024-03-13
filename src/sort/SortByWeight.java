package sort;

import java.util.Comparator;

public class SortByWeight implements Comparator<Product> {
    @Override
    public int compare(Product o, Product t1) {
            return ((Product) o).getWeight()-((Product) t1).getWeight();
    }
}
