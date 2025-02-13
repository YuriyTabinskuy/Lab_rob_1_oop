public class ThirthyTask {
    public static void main(String[] args) {
        
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Запуск через анонімний клас");
            }
        };

        Runnable task2 = () -> System.out.println("Запуск через лямбду");

        new Thread(task1).start();
        new Thread(task2).start();
    }
}
