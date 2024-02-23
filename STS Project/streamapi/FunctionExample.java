import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
//        Function<Integer, String> val = n -> ("The output is: " + n);
        Function<Integer, Integer> val = n -> n*n;
//        String result = val.apply(5);
        Integer result = val.apply(5);
        System.out.println(result);
    }
}
