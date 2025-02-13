import java.util.function.Function;

public class SevenTask {
        public static void main(String[] args) {

        //Допишіть спосіб 1

        //Спосіб 2
    Function<Integer, String> gradeToText = grade -> {
            if (grade >= 90) return "Відмінно";
            else if (grade >= 75) return "Добре";
            else if (grade >= 60) return "Задовільно";
            else return "Незадовільно";
    };

    System.out.println(gradeToText.apply(85)); 
            

    }
}
