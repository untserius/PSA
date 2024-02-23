import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeExample {
    public static void main(String[] args) {
        List<Employee> data = Arrays.asList(
                new Employee(1, "mike", 3000),
                new Employee(2, "adam", 6000),
                new Employee(3, "john", 4000),
                new Employee(4, "max", 10000),
                new Employee(5, "lucas", 10000)
        );

        var result = data.stream().filter(e -> e.getSalary() > 3000).map(e -> e.getName()).collect(Collectors.toList());
        var reduceSalary = data.stream().map(e -> e.getSalary() - 500).collect(Collectors.toList());
        var ids = data.stream().map(Employee::getId).collect(Collectors.toList());
        System.out.println(result);
        System.out.println(reduceSalary);
        System.out.println(ids);
    }
}
