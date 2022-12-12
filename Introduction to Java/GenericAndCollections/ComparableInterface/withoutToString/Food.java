package GenericAndCollections.ComparableInterface.withoutToString;

public class Food implements Comparable {
    private String item;

    @Override
    public int compareTo(Object o) {
        if (o instanceof Food) {
            Food f = (Food) o;
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
}
