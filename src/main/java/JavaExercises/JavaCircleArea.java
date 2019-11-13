package JavaExercises;

/**
 * //        Write a method to calculate the area of a circle (pi * r^2) given only the circumference.
 * //        To find the value of the radius you will create another method.
 * //        The calculation to work out the diameter of a circle is circumference/pi and
 * //        then divide that by 2 in order to find the radius.
 */

public class JavaCircleArea {

    // Method to calculate radius -> c / 2pi
    private double calcRad(double circumference) {
        double diameterResult = circumference / Math.PI;
        double radResult = diameterResult / 2;
        System.out.println(radResult);
        return radResult;
    }

    // Method to calculate area -> pi * r^2
    public double calcArea(double circumference) {
        double radius = calcRad(circumference);
        double circleArea = (radius * radius) * Math.PI;
        System.out.println("The Area of the Circle is " + circleArea);
        return circleArea;
    }

}