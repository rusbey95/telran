package lesson3;

public class Lesson3 {
    public static void main(String[] args) {
//        1) Продемонстрировать переполнение типа
//        2) Показать явное и неявное приведение типов
//        3) Преобразовать примитивный тип к строке
//        4) Создать метод для сложения чисел
//        5) Форматированный вывод
//        6) Сделать таблицу со всеми примитивными типами

        // Task 1 - Продемонстрировать переполнение типа
        byte a1 = 120;
        a1 += 19;
        System.out.println(a1);

        // Task 2 - Показать явное и неявное приведение типов
        // Explicit Conversions
        int a2 = 5;
        byte b2 = (byte) a2;
        System.out.println(b2);
        // Implicit conversion
        int a22 = 1235234;
        float b22 = a22;
        System.out.println(b22);

        // Task 3 - Преобразовать примитивный тип к строке
        int a3 = 123;
        String b3 = "" + a3;
        System.out.println(b3);

        // Task 4 - Создать метод для сложения чисел
        addition(20, 15);


        // Classwork
        System.out.printf("%10s | %10s | %10s | %10s | %10s | %10s | %10s | %10s |\n","byte", "short", "int", "long", "float", "double",
                "char", "boolean");
        byte b = 1;
        short s = 2000;
        int i = 1000000000;
        long l = 10000000000l;
        float f = 12.345f;
        double d1 = 25.64775;
        char c = 's';
        boolean bool = true;


        System.out.println("-------------------------------------------------------------------------------------------" +
                "------------------");
        System.out.printf("%10d | %10d | %10d | %10d | %10f | %10f | %10c | %10b |", b, s, i, l, f, d1, c, bool);
    }
    public static void addition(int a, int b) {
        System.out.println(a + b);
    }

}
