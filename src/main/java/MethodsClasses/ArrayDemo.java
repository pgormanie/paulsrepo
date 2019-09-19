package MethodsClasses;

public class ArrayDemo {

    public static void main(String[] args) {
        // Arrays with Integers
        int[] numbers = new int[5];  //Set the size of the array which cannot be changed

        // Two ways to assign values in the array and where they are indexed
        numbers[0] = 11;
        numbers[1] = 22;
        numbers[2] = 33;
        numbers[3] = 44;
        numbers[4] = 55;

        // OR using one line
        int[] numbers2 = {11, 22, 33, 44, 55};

        System.out.println("Third index: " + numbers[4]);
        System.out.println(("First Number: " + numbers2[0]));

        // Arrays with Strings
        String[] myFavGuitars = {"Fender", "Ibanez", "Gretsch", "Rodriguez"};
        System.out.println("Index 1: " + myFavGuitars[2]);
    }
}