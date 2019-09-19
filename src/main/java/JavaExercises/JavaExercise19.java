package JavaExercises;


import java.util.Scanner;

public class JavaExercise19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstDecimal;
        int secondDecimal;
        int thirdDecimal;
        System.out.println("Please enter the first digit of a 3 decimal number: ");
        firstDecimal = input.nextInt();
        System.out.println("Enter the second digit of the 3 decimal number: ");
        secondDecimal = input.nextInt();
        System.out.println("Enter the thirds digit of the 3 decimal number: ");
        thirdDecimal = input.nextInt();


        int firstDecimalBinaryCalc = firstDecimal * 8;
        int secondDecimalBinaryCalc = secondDecimal * 4;
        int thirdDecimalBinaryCalc = thirdDecimal * 2;


        int result = Integer.valueOf(String.valueOf(firstDecimal) + String.valueOf(secondDecimal) + String.valueOf(thirdDecimal));
        System.out.println("The result is: " + result);

//        ((firstDecimal * 8) + (secondDecimal * 4 + thirdDecimal * 2 ))

//3714
//        100 : 2 = 50 + 0
//         50 : 2 = 25 + 0
//         25 : 2 = 12 + 1
//         12 : 2 =  6 + 0

//        int quickCalc = firstDecimal * 100;
//        System.out.println(quickCalc);
//        int quickCalcAgain = secondDecimal * 10;
//        System.out.println(quickCalcAgain);
//        int quickCalcAgainnn = thirdDecimal * 1;
//        System.out.println(quickCalcAgainnn);

    }
}

//19. Write a Java program to convert a decimal number to binary number. Go to the editor
//        Input Data:
//        Input a Decimal Number : 5
//        Expected Output
//
//        Binary number is: 101

//(1 * (10*10) + (0 * (10 * 1) + 1 * (10 * 0))) = 101
//(5 * 100 +    7 * 10    +    6 * 1
//
//10 to the power of 2 = 100
//10 to the power of 1 = 10
//10 to the power of 0 = 1

//1011
//        (1 * (2 * 2 * 2)  +  (0 * (2 * 2)  +  (1 * (2 * 1)) ))

