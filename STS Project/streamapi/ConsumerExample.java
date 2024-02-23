import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Integer> val = e -> System.out.println(e);
        val.accept(10);
    }
}
