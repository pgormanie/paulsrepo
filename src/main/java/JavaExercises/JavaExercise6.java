package JavaExercises;

import java.util.Scanner;

public class JavaExercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Enter First Number:");
        a = input.nextInt();
        System.out.println("Enter Second Number:");
        b = input.nextInt();

        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        int mod = a % b;

        System.out.println("125 + 24 = " + addition);
        System.out.println("125 - 24 = " + subtraction);
        System.out.println("125 x 24 = " + multiplication);
        System.out.println("125 / 24 = " + division);
        System.out.println("125 mod 24 = " + mod);
    }
}
//6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. Go to the editor
//        Test Data:
//        Input first number: 125
//        Input second number: 24
//        Expected Output :
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5