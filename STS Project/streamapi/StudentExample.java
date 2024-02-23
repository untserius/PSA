import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentExample {
    public static void main(String[] args) {
        var data = Arrays.asList(
                new Student(1, "Rajat", 1000),
                new Student(2, "Saurav", 999),
                new Student(3, "Sudhir", 800),
                new Student(4, "Souradip", 900),
                new Student(5, "Nishant", 1000)
        );

        Map<Integer, List<String>> markSecured = data.stream()
                .collect(Collectors.groupingBy(e -> e.getMarks(), Collectors.mapping(e -> e.getName(), Collectors.toList())));

        markSecured.forEach((n, m) -> System.out.println(n + " = " + m));
    }
}
