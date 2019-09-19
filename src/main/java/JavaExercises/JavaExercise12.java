package JavaExercises;

import java.util.Scanner;

public class JavaExercise12 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        a = input.nextInt();
        System.out.println("Please enter your second number: ");
        b = input.nextInt();
        System.out.println("Please enter your third number: ");
        c = input.nextInt();
        int average = ((a + b + c) / 3);
        System.out.println("The average number is: " + average);
    }

}

//12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers. Go to the editor
//        Click me to see the solution