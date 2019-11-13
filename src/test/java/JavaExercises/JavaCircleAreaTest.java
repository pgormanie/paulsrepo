package JavaExercises;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(MockitoJUnitRunner.class)
public class JavaCircleAreaTest {
    @Test
    public void shouldCalcRadius() {
        //given
        JavaCircleArea calcRadiusTest = new JavaCircleArea();

        double circumference = 69.99734211053;
        double radius = (circumference/Math.PI)/2;
        double expectedArea = (radius * radius) * Math.PI;

        //when
        double areaResult = calcRadiusTest.calcArea(circumference);

        //then
        assertEquals(expectedArea, areaResult, 000.1);

    }

}

/**
 * //       Area, A = 389.9 m2
 * //
 * //       Then:
 * //       Radius, r = 11.140423000185 m
 * //       Diameter, d = 22.280846000371 m
 * //     Circumference, C = 69.99734211053 m
 */