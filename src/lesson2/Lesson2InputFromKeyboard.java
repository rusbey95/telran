package lesson2;

import java.util.Scanner;

public class Lesson2InputFromKeyboard {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter name -");
        String name = input.nextLine();

        System.out.println("Please enter number -");
        int number = input.nextInt();


        System.out.println("Your name is - " + name);
        System.out.println("Your number is - " + number);

    }
}
