package Stack;

//sort the common elements between two lists
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits1 = Arrays.asList("Apple", "Banana", "Mango", "Kiwi");

        List<String> fruits2 = Arrays.asList("Pear", "Kiwi", "Banana", "Orange");


        List<String> common = fruits1.stream()
                .filter(fruits2::contains)
                .sorted()
                .toList();

        System.out.println(common);


        HashSet<String> set = new HashSet<>();

        set.add("Rahul");
        set.add("Rahul");
        System.out.println(set);
    }
}
