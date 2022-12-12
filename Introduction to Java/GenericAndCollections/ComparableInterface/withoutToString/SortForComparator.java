package GenericAndCollections.ComparableInterface.withoutToString;

import java.util.Comparator;

public class SortForComparator implements Comparator<Food> {
    @Override
    public int compare(Food f1, Food f2) {
        return f1.getItem().compareTo(f2.getItem());
    }
}
