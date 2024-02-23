import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PrintConsumer {
    public static void main(String[] args) {
        Consumer<Integer> consumer = e -> System.out.println(e);

        List<Integer> data = Arrays.asList(1,2,3,4,5,6,7);

        data.forEach(consumer);
    }
}
