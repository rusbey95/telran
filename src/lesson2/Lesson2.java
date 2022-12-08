package lesson2;

public class Lesson2 {
    public static void main(String[] args) {

        // Task 1
        int x = 54;
        int y = 16;
        int z = x + y;
        System.out.println("Result = " + z);

        // Task 2
        int x2 = 50;
        int y2 = 3;
        int z2 = x2 / y2;
        System.out.println("Result 2 = " + z2);

        // Task 3
        int x3 = -5;
        int y3 = 8;
        int z3 = 6;
        int result = x3 + y3 * z3;
        System.out.println("Result 3 = " + result);

        // Task 4
        int x4 = 55;
        int y4 = 9;
        int z4 = 9;
        int result2 = (x4 + y4) % z4;
        System.out.println("Result 4 = " + result2);

        // Task 5
        int x5 = 5;
        int y5 = 2;
        double z5 = Math.pow(x5, y5);
        System.out.println("Result 5 = " + z5);

        // Task 6
        int a1 = 0;
        int a2 = 1;
        int a3 = 2;
        int a4 = 3;
        int a5 = 4;
        int a6 = 5;
        int a7 = 6;
        int a8 = 7;
        int a9 = 8;
        int a10 = 9;
        double b1 = 10.0;
        double result6 = (a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9 + a10) / b1;
        System.out.println("Result 6 = " + result6);

        // Task 7
        double b7 = 1000;
        double c7 = 500;
        double discount7 = 10;
        double sum7 = b7 + c7;
        double discountResult7 = (sum7 * discount7) / 100;
        double sumDiscount7 = sum7 - discountResult7;
        System.out.println("Discount % = " + discountResult7);
        System.out.println("Price + Sale = " + sumDiscount7);

        // Task 8
        String b8 = "test";
        System.out.println(b8);

        // Task 9
        String name1 = "Ivan";
        String name2 = "Petr";
        System.out.println("Hi " + name1 + "! How are you?");
        System.out.println("Hi " + name2 + "! How are you?");

        /* classwork

            Type conversion:
            byte -> short -> int -> long


            long xClass = 10000000000L;
            System.out.println(xClass);

         */


    }
}
