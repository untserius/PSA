import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {

//        ArrayList<Integer> data = new ArrayList<>();
//        data.add(12);
//        data.add(13);
//        data.add(14);
//        data.add(15);
//        data.add(16);
        List<Integer> data = Arrays.asList(12, 13, 14, 15, 16);
//        List<Integer> newData = data.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        List<Integer> newData = data.stream().filter(n -> n % 2 == 0).toList(); //.toList() introduced in Java 16
        System.out.println(newData);

        List<String> list = Arrays.asList("mike", "jack", "jack", "jack", "jack", "bella", "john", "saul", "saul");
//        List<String> newList = list.stream().filter(n -> n.startsWith("j")).collect(Collectors.toList());
//        List<String> newList = list.stream().filter(n -> n.equalsIgnoreCase("bella")).collect(Collectors.toList());
        List<String> newList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(newList);

    }
}
