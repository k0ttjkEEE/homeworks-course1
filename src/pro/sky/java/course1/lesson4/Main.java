package pro.sky.java.course1.lesson4;

public class Main {

    public static void main(String[] args) {
        //dz 1.4/1
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.println(a);
        }
        int b = 11;
        while (b > 1) {
            b = b - 1;
            System.out.println(b);
        }
        ///dz1.4/2
        for (int i = 7; i < 31; i = i + 7) {
            System.out.println("Сегодня пятница " + i + " число, пора сдать отчет");
        }
        ///dz1.4/3
        int now = 2021;
        for (int i = 1821; i < 2121; i++) {
            if (i % 79 == 0)
                System.out.println("В этот год комета пролетит " + i);
        }
        ///dz1.4/4
        for (int i = 1; i <= 30; i++) {
            boolean three = i % 3 == 0;
            boolean five = i % 5 == 0;
            boolean threeFive = (i % 3 == 0 && i % 5 == 0);
            if (threeFive) {
                System.out.println(i + ": ping pong");
            } else if (three) {
                System.out.println(i + ": ping");
            } else if (five) {
                System.out.println(i + ": pong");
            } else {
                System.out.println(i);
            }
        }
    }
}














