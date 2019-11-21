package JavaExercises;

public class JavaCircleArea {

    // Method to calculate diameter and then radius -> radius = circumference / pi / 2
    public double calcCircleRad(double circumference) {
        double diameterResult = circumference / Math.PI;
        double radResult = diameterResult / 2;
        return radResult;
    }

    // A = Pi * (R Squared)
    public double calcCircleArea(double radius) {
        double radSqrd = calcCircleRad(360);
        double circleAreaResult = radSqrd * Math.PI;
        return circleAreaResult;
    }

}