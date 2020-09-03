package MentorWork;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class SimpleForLoopTest {
    @Test
    public void shouldReturnConcatenatedStringWhenListIsPassed() {
        //given
        SimpleForLoop simpleForLoop = new SimpleForLoop();
        List<String> stringList= new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Hello World");
        stringList.add("Blah");

        //when
        String returnString = simpleForLoop.convertListToString(stringList);

        //then
        assertEquals(returnString,"HelloHello WorldBlah");
    }

}
