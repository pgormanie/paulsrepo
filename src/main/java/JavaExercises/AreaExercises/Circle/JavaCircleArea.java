package JavaExercises.AreaExercises.Circle;

public class JavaCircleArea {

    // Method to calculate diameter and then radius -> radius = circumference / pi / 2


    // A = Pi * (R Squared)
    public double calcCircleArea(double radius) {
        double radSqrd = radius * radius;
        double circleAreaResult = radSqrd * Math.PI;
        return circleAreaResult;
    }

}