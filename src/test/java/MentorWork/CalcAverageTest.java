package MentorWork;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CalcAverageTest {
    @Test
    public void shouldCalcCorrectAverage() {
        // given
        CalcAverage calcAverage = new CalcAverage();
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        // when
        int result = calcAverage.calcAverage(num1, num2, num3);

        // then
        Assert.assertEquals(2, result);

        System.out.println();
    }
}
