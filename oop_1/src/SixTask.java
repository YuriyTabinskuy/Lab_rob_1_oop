import java.util.function.Consumer;

public class SixTask {
    public static void main(String[] args) {

        //Допишіть і виведіть результат спосіб 1





        Consumer<String> printStudent = name -> System.out.println("Студент: " + name);
        printStudent.accept("Олександр"); 
    }
}

