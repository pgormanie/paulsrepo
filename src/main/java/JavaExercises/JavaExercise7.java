package JavaExercises;

import java.util.Scanner;

public class JavaExercise7 {
    public static void main(String[] args) {
        int a;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter in a number to show the multiplication table: ");
        a = input.nextInt();
        System.out.println("8 x 1 = " + a * 1);
        System.out.println("8 x 2 = " + a * 2);
        System.out.println("8 x 3 = " + a * 3);
        System.out.println("8 x 4 = " + a * 4);
        System.out.println("8 x 5 = " + a * 5);
        System.out.println("8 x 6 = " + a * 6);
        System.out.println("8 x 7 = " + a * 7);
        System.out.println("8 x 8 = " + a * 8);
        System.out.println("8 x 9 = " + a * 9);
        System.out.println("8 x 10 = " + a * 10);
    }
}

//7. Write a Java program that takes a number as input and prints its multiplication table upto 10. Go to the editor
//        Test Data:
//        Input a number: 8
//        Expected Output :
//        8 x 1 = 8
//        8 x 2 = 16
//        8 x 3 = 24
//        ...
//        8 x 10 = 80