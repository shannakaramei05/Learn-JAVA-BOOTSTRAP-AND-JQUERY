package GenericAndCollections.ComparableInterface;

import java.util.ArrayList;
import java.util.List;

public class FoodWithComparatorWithFoodToString {
    private String item;

    public static void main(String[] args) {
        List<FoodWithString> junkFoodItems = new ArrayList<FoodWithString>();

        // create a list of a FoodWithToString
        junkFoodItems.add(addItemToFoodList("Pizza"));
        junkFoodItems.add(addItemToFoodList("French Fries"));
        junkFoodItems.add(addItemToFoodList("Milk Shake"));
        junkFoodItems.add(addItemToFoodList("Burger"));
        junkFoodItems.add(addItemToFoodList("Fried Chicken"));

        // print
        System.out.println("Before Sorting : " + junkFoodItems.toString());

        // sorting
        SortComparatorWithFoodWithString sfc = new SortComparatorWithFoodWithString();

        junkFoodItems.sort(sfc);
        System.out.println("After Sorting : " + junkFoodItems.toString());

    }

    public static FoodWithString addItemToFoodList(String item) {
        FoodWithString f = new FoodWithString();
        f.setItem(item);
        return f;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
