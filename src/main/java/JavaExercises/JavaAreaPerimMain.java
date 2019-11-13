package JavaExercises;

public class JavaAreaPerimMain {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;

        JavaAreaPerim javaAreaPerim = new JavaAreaPerim();
        double resultTriArea = javaAreaPerim.calcTriArea(a, b);
        System.out.println("Area of Triangle is " + resultTriArea);
        double triPerimCalc = javaAreaPerim.calcTriPerim(a, b);
        System.out.println("Perimeter of Triangle is " + triPerimCalc);
    }

}