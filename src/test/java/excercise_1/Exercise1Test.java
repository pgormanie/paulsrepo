package excercise_1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class Exercise1Test {
    @Test
    public void shouldCalcCorrectAverage() {
        // given
        Exercise1 exercise1 = new Exercise1();
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        // when
        int result = exercise1.calcAverage(num1, num2, num3);

        // then
        Assert.assertEquals(2, result);
    }
}
