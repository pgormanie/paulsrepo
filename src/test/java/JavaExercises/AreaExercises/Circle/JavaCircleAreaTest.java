package JavaExercises.AreaExercises.Circle;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class JavaCircleAreaTest {
    @Test
    public void shouldCalcRadius() {
        //given
        JavaCircleArea javaCircleArea = new JavaCircleArea();
        int diameterResult = 100;
        int radius = diameterResult/2;
        double expectedResult = Math.PI * (radius * radius);
        //when

        double areaResult = javaCircleArea.calcCircleArea(radius);
        //then
        Assert.assertEquals(expectedResult, areaResult, 0.001);
        System.out.println();
    }

}