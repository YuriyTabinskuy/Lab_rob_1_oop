import java.util.function.Predicate;

public class IndTaskSecond {
    public static void main(String[] args){
        Predicate<Integer> Student = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer >= 5) return true;
                else return false;
        }

    };
    System.out.println(Student.test(6));

    //2-ий спосіб
    Predicate<Integer> Student2 = integer -> integer >= 5;

        System.out.println(Student2.test(1));
}
}