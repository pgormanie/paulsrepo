package JavaExercises;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class JavaAreaPerimTest {
    @Test
    public void shouldCalcTriArea() {
        // given
        JavaAreaPerim calcTriAreaTest = new JavaAreaPerim();

        double a = 3;
        double b = 4;
        double expectedTriArea = (a * b) / 2;

        // when
        double areaResult = calcTriAreaTest.calcTriArea(a, b);

        // then
        assertEquals(expectedTriArea, areaResult, 0.0001);
    }

//    public void shouldCalcTriPerTest() {
//        // given
//        JavaAreaPerim calcTriPerimTest = new JavaAreaPerim();
//
//        double a = 3;
//        double b = 4;
//        double h = 5;
//        double expectedTriPerim = a + b + h;
//
//        // when
//        double perimResult = calcTriPerimTest.calcTriPerim(a, b);
//
//        // then
//        assertEquals(expectedTriPerim, perimResult, 000.1);
//    }

}

