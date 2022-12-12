package GenericAndCollections.ComparableInterface.withoutToString;

import java.util.ArrayList;
import java.util.List;

public class FoodWithComparator {
    private String item;

    public static void main(String[] args) {
        List<Food> junkFoodItems = new ArrayList<Food>();

        // create a list of Food
        junkFoodItems.add(addItemToFoodList("Pizza"));
        junkFoodItems.add(addItemToFoodList("French Fries"));
        junkFoodItems.add(addItemToFoodList("Milk Shake"));
        junkFoodItems.add(addItemToFoodList("Burger"));
        junkFoodItems.add(addItemToFoodList("Fried Chicken"));

        System.out.println("Before Sorting : " + junkFoodItems.toString());

        // create an object for Comparator to sort by item
        SortForComparator sfc = new SortForComparator();
        junkFoodItems.sort(sfc);

        System.out.println("After Sorting : " + junkFoodItems.toString());
    }

    public static Food addItemToFoodList(String item) {
        Food f = new Food();
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
