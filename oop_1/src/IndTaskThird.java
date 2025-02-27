import java.util.Arrays;  
import java.util.List;  
import java.util.function.Function;  
import java.util.function.Predicate;  

public class IndTaskThird {  
    public static void main(String[] args) {  
   
        List<Integer> grades = Arrays.asList(95, 85, 75, 65, 55, 45);  


        System.out.println("Результати без Stream:");  
        

        Predicate<Integer> isEligible = new Predicate<Integer>() {  
            public boolean test(Integer grade) {  
                return grade >= 60;  
            }  
        };  

 
        Function<Integer, String> gradeToString = new Function<Integer, String>() {  
            public String apply(Integer grade) {  
                if (grade >= 90) return "Відмінно";  
                else if (grade >= 75) return "Добре";  
                else if (grade >= 60) return "Задовільно";  
                else return "Недостатньо";  
            }  
        };  


        for (Integer grade : grades) {  
            if (isEligible.test(grade)) {  
                String result = gradeToString.apply(grade);  
                System.out.println("Оцінка: " + grade + " - Результат: " + result);  
            }  
        }  

        // 2   з використанням Stream
        System.out.println("Результати з Stream:");  
        
        grades.stream()  
            .filter(isEligible) 
            .map(gradeToString)
            .forEach(result -> System.out.println("Результат: " + result)); 
    }  
}