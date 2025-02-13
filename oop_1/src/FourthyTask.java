import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

@SuppressWarnings("unused")
public class FourthyTask {
    public static void main(String[] args) {
        //Спосіб 1
        Supplier<Integer> task1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return new Random().nextInt(100);
            }
        };

        System.out.println("Випадкове число: " + task1.get());

        //Спосіб 2
        Supplier<Integer> randomSupplier = () -> new Random().nextInt(100);
        System.out.println("Випадкове число: " + randomSupplier.get());
    }
}
