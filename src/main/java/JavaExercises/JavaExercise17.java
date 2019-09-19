package JavaExercises;

import java.util.Scanner;

public class JavaExercise17 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("Input first binary number: ");
        a = input.nextInt();
        System.out.println("Input second binary number: ");
        b = input.nextInt();
        int sum = a + b;
        System.out.println("Sum of the binary numbers: " + sum);
    }
}

//17. Write a Java program to add two binary numbers. Go to the editor
//        Input Data:
//        Input first binary number: 10
//        Input second binary number: 11
//        Expected Output
//
//        Sum of two binary numbers: 101