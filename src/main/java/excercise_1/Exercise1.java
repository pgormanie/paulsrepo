package excercise_1;

public class Exercise1 {

    public int calcAverage(int num1, int num2, int num3){

        return (num1+num2+num3)/3;
    }

    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        Exercise1 exercise1 = new Exercise1();
        int result = exercise1.calcAverage(num1, num2, num3);
        System.out.println("The average number is: " + result);
    }
}
