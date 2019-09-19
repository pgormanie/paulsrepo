package JavaExercises;

public class JavaExercise32 {
    public static void main(String[] args) {
        int firstInt = 25;
        int secondInt = 39;

        if (firstInt != secondInt) {
            System.out.println("25 != 39");
        } else {
            System.out.println(firstInt + " is equal to " + secondInt);
        }
        if (firstInt < secondInt) {
            System.out.println("25 < 39");
        } else {
            System.out.println(firstInt + " is bigger than " + secondInt);
        }
        if (firstInt <= secondInt) {
            System.out.println("25 <= 39");
        } else {
            System.out.println(firstInt + " is either less than or equal to " + secondInt);
        }
    }

}

//32. Write a Java program to compare two numbers. Go to the editor
//        Input Data:
//        Input first integer: 25
//        Input second integer: 39
//        Expected Output
//
//        25 != 39
//        25 < 39
//        25 <= 39
