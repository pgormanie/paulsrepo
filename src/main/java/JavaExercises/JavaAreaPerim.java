package JavaExercises;

import java.lang.Math;

/**
 * //        Calculate the area and perimeter of a right triangle
 * //        given all the sides except the hypotenuse.
 * //        a = a * b / 2
 * //        p = a + b + h
 * //        h = √(a²+b²)
 */

public class JavaAreaPerim {

    // Method to calculate the area given only a and b
    public double calcTriArea(double a, double b) {
        double triAreaResult = (a * b) / 2;   // a = a * b / 2
        return triAreaResult;
    }

    // Method to calculate the perimeter given only a and b
    public double calcTriPerim(double a, double b) {
        double triHypCalc = Math.sqrt((a * a) + (b * b));   // h = √(a²+b²)
        double triPerimCalc = a + b + triHypCalc;   // p = a + b + sqrt(a*a + b*b
        System.out.println("Hypotenuse of the Triangle is " + triHypCalc + " when one side is " + a + " and the other is " + b);
        return triPerimCalc;
    }

}