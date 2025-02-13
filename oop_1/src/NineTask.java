import java.util.function.Predicate;

public class NineTask {
    public static void main(String[] args) {

        //Спосіб 1
        Predicate<Integer> hasP = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer>=60) return true;
                else return false;
            }
        };
        System.out.println(hasP.test(80));
        
        //Допишіть спосіб 2
        
    }

}
