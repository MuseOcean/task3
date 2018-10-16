public class Main {
    public static void main(String[] args) {
        init();
    }

    private static void init() {
        Tasks numbers = new Tasks();
        System.out.println( numbers.task1(2,2 ));
        System.out.println( numbers.task2(2,2 ));
        System.out.println( numbers.task3(2,2,4 ));
        System.out.println( numbers.task4(0,2,3 ));
        System.out.println( numbers.task5(16 ));

    }
}
