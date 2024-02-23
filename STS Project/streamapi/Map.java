import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(12, 23, 11, 45);
        var newData = data.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(newData);

        List<String> list = Arrays.asList("mike", "adam", "alex", "nicole", "jose");
        System.out.println(list.stream().map(e -> e.toUpperCase()).collect(Collectors.toList()));
    }
}
