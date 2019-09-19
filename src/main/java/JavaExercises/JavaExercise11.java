package JavaExercises;

public class JavaExercise11 {
    public static void main(String[] args) {
        Double radius = 7.5;
        double perimeter = (Math.PI * 2) * radius;
        Double area = ((radius * radius) * Math.PI);
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}

//11. Write a Java program to print the area and perimeter of a circle. Go to the editor
//        Test Data:
//        Radius = 7.5
//        Expected Output
//        Perimeter is = 47.12388980384689 (2πr)
//        Area is = 176.71458676442586 (πr2)
