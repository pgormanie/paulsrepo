package JavaExercises;

public class JavaCircleAreaMain {
    public static void main(String[] args) {
        double circumference = 69.9;

        JavaCircleArea javaCircleArea = new JavaCircleArea();
        double resultCalcArea = javaCircleArea.calcArea(circumference);
        System.out.println(resultCalcArea);
    }

}