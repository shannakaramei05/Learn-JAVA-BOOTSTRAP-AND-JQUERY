package GenericAndCollections.ComparableInterface;

public class FoodWithString implements Comparable {
    private String item;

    @Override
    public int compareTo(Object o) {
        if (o instanceof FoodWithString) {
            FoodWithString f = (FoodWithString) o;
            return item.compareTo(f.getItem());
        }
        return 0;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String toString() {
        return this.item;
    }

}
