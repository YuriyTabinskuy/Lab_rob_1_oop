import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IndTaskThird {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> grades = Arrays.asList(95, 85, 75, 65, 55, 45);
        Predicate<Integer> isEligbleForExam = grade -> grade >= 60;

        Function<Integer, String> gradeToText = grade -> {
            if (grade >= 90) return "Відмінно";
            else if (grade >= 75) return "Добре";
            else if (grade >= 60) return "Задовільно";
            else return "Незадовільно";
        };

        // Перший спосіб
        List<Integer> eligibleGrades = new ArrayList<>();
        for (Integer grade : grades) {
            if (isEligbleForExam.test(grade)) {
                eligibleGrades.add(grade);
            }
        }

        for (Integer grade : eligibleGrades) {
            System.out.println("Оцінка " + grade + " -> " + gradeToText.apply(grade));
        }

        // Другий спосіб
        List<String> results = grades.stream()
                .filter(isEligbleForExam)
                .map(grade -> "Оцінка " + grade + " -> " + gradeToText.apply(grade))
                .collect(Collectors.toList());

        results.forEach(System.out::println);

        System.out.print("Введіть вашу оцінку: ");
        int userGrade = scanner.nextInt();

        System.out.println("Оцінка " + userGrade + " -> " + gradeToText.apply(userGrade));

        if (isEligbleForExam.test(userGrade)) {
            System.out.println("Ви допущені до іспиту.");
        } else {
            System.out.println("Ви НЕ допущені до іспиту.");
        }
    }
}
