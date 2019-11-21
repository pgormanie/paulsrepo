package JavaExercises;

public class JavaCircleAreaMain {

    // Main method creates an instance of circleArea and passes the radius value of 50
    public static void main(String[] args) {
        JavaCircleArea circleArea = new JavaCircleArea();
        double circleRadiusResult = circleArea.calcCircleRad(360);
        System.out.println("The Radius of the Circle is " + circleRadiusResult);
        double circleAreaResult = Math.PI * (circleRadiusResult * circleRadiusResult);
        System.out.println("The Area of the Circle is " + circleAreaResult);
        System.out.println("Anything");
    }

}