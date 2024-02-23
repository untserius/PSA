import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
//        Predicate<Integer> result = n -> n % 2 == 0; // boolean valued function
//        boolean val = result.test(101);
//        System.out.println(val); // false

//        Predicate<String> result = n -> n.startsWith("m");
//        boolean val = result.test("mike");
//        System.out.println(val);

//        Predicate<String> result = n -> n.endsWith("n");
//        boolean val = result.test("jason");
//        System.out.println(val);

//        Predicate<String> result = n -> n.equals("jackson");
//        boolean val = result.test("Jackson");
//        System.out.println(val);

        Predicate<String> result = n -> n.equalsIgnoreCase("jack");
        boolean val = result.test("Jack");
        System.out.println(val);

    }
}
