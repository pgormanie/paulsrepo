package MethodsClasses;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)

public class ArrayListDemoTest {
    @Test
    public void shouldCalcCorrectArrayLength() {
        // given
        ArrayListDemo exercise1 = new ArrayListDemo();

        // when
        int result = exercise1.getArrayListSize();

        // then
        Assert.assertEquals(5, result);

    }
}