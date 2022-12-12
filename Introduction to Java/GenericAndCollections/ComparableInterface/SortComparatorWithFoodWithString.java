package GenericAndCollections.ComparableInterface;

import java.util.Comparator;

public class SortComparatorWithFoodWithString implements Comparator<FoodWithString> {
    @Override
    public int compare(FoodWithString f1, FoodWithString f2) {
        return f1.getItem().compareTo(f2.getItem());
    }
}
