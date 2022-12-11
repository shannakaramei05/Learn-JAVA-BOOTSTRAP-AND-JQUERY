import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        // Example 1
        Stream.of("a1", "a2", "a3")
                .findFirst()
                .ifPresent(System.out::println);

        // Example 2
        List<String> names = new ArrayList<String>();
        names.add("Marry");
        names.add("Steve");
        names.add("Adams");
        names.add("Chris");
        names.add("Allen");
        names.forEach(new Consumer<String>() {
            public void accept(String name) {
                System.out.println(name);
            }
        });

    }
}
