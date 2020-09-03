package AccessModifierTest;

import MentorWork.ListExercise;

public class AccessModifierTest {

    public void tryToAccessPrivateMethod(){
        ListExercise listExercise = new ListExercise();
        listExercise.addElementToList("Hello");

    }
}
