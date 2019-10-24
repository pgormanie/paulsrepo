package JavaExercises;

public class JavaCircleArea {

    // Method to calculate diameter and then radius -> radius = circumference / pi / 2
    public static double calcRad(double circumference) {
        double diameterResult = circumference / Math.PI;
        double radResult = diameterResult / 2;
        return radResult;
    }

    // Main method creates an instance of circleArea and passes the radius value of 50
    public static void main(String[] args) {
        JavaCircleArea circleArea = new JavaCircleArea();
        double circleAreaNew = Math.PI * ((calcRad(100) * calcRad(100)));
        System.out.println("The Area of the Circle is " + circleAreaNew);

    }
}