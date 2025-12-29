import java.util.ArrayList;
import java.util.List;

public class remove_index_elements {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        System.out.println("Original List: " + fruits);

        String removedFruit = fruits.remove(1);

        System.out.println("Removed Element: " + removedFruit);
        System.out.println("Modified List: " + fruits);
    }
}