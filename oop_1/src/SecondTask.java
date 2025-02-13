@FunctionalInterface
interface PassChecker {
    boolean hasPassed(double grade);    
}
public class SecondTask {
    public static void main(String[] args) {
        PassChecker passChecker =  grade -> grade >=60;
            

    System.out.println("Студент склав предмет?" + passChecker.hasPassed(75));
    System.out.println("Студент склав предмет?" + passChecker.hasPassed(50));

    
}
}