import java.util.function.Function;

public class IndTaskFirst {

    public static void main(String[] args) {
        Function<Integer, String> gradeConverter = new Function<Integer, String>() {
            @Override
            public String apply(Integer grade) {
                if (grade >= 90) return "Відмінно";
                else if (grade >= 75) return "Добре";
                else if (grade >= 60) return "Задовільно";
                else return "Незадовільно";
            }
        };

        testGradeConverter(gradeConverter, 95);

        testGradeConverter(gradeConverter, 80);

        testGradeConverter(gradeConverter, 70);
        
        testGradeConverter(gradeConverter, 50);
    }

    public static void testGradeConverter(Function<Integer, String> converter, int grabe) {
        System.out.println("Оцінка " + grabe + " -> " + converter.apply(grabe));
    }
}
