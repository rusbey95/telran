package lesson1;

public class LessonVarExample {
    public static void main(String[] args) {

        //Vars type int
        int x = 25;
        int y = 20;
        System.out.println(x);

        //Vars type double
        double pi = Math.PI;
        double result = x * pi;
        System.out.println("Pi = " + pi);
        System.out.println("Result = " + result);

        //Vars type boolean
        boolean check;
        check = x >= y;
        System.out.println(check);

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 & b2);
        System.out.println(b1 || b2);
        System.out.println(!b2);

        int a = 10;
        int b = 4;

        float tet = a / b;
        System.out.println(tet);

    }
}
