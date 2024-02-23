import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> val = ()-> Math.random();
        var newVal = val.get();
        System.out.println(newVal);
    }
}
