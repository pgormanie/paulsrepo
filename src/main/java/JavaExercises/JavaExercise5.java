package JavaExercises;

import java.util.Scanner;

public class JavaExercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Enter First Number:");
        a = input.nextInt();
        System.out.println("Enter Second Number:");
        b = input.nextInt();
        int sum = a * b;
        System.out.println("25 x 5 = " + sum);
    }
}

//5. Write a Java program that takes two numbers as input and display the product of two numbers. Go to the editor
//        Test Data:
//        Input first number: 25
//        Input second number: 5
//        Expected Output :
//        25 x 5 = 125