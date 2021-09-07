package pro.sky.java.course1.lesson5;

public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }


    public static void main(String[] args) {

        task1();

        task2();

        task3();

//        task4();

//        task5();


    }

    private static void task1() {
        int[] everyDaySumm = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < everyDaySumm.length; i++) {
            sum += everyDaySumm[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    private static void task2() {
        int[] everyDaySumm = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < everyDaySumm.length; i++) {
            sum += everyDaySumm[i];
        }
        System.out.println("Средняя сумма затрат составила " + (sum / 30) + " рублей");
    }

    private static void task3() {
        int[] daysInMonth = generateRandomArray();
        int sum = 0;

    }
}
