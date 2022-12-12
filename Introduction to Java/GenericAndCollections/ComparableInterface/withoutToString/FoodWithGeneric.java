package GenericAndCollections.ComparableInterface.withoutToString;

public class FoodWithGeneric implements Comparable<Food> {
    private String item;

    @Override
    public int compareTo(Food f) {
        return item.compareTo(f.getItem());
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
