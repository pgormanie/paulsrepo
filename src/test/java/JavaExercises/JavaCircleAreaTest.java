package JavaExercises;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class JavaCircleAreaTest {
    @Test
    public void shouldCalcRadius() {
        //given
        JavaCircleArea calcRadiusTest = new JavaCircleArea();
        int diameterResult = 100;
        //when
        int radResult = diameterResult / 2;
        //then
        Assert.assertEquals(50, radResult);
        System.out.println();
    }
}
