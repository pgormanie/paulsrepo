package MentorWork;

import java.util.ArrayList;

public class ForLoopExercise {
    public static void main(String[] args) {
        ArrayList<String> guitarList = new ArrayList<>();
        guitarList.add("Fender");
        guitarList.add("Ibanez");
        guitarList.add("Taylor");
        guitarList.add("Gibson");

        ForLoopExercise forLoopExercise = new ForLoopExercise();
//        forLoopExercise.standardForLoop(guitarList);
//        forLoopExercise.skipEverySecondElementForLoop(guitarList);
        forLoopExercise.listElementsBackwards(guitarList);
//        forLoopExercise.addNewElementAfterEveryIteration(guitarList);
    }

//    public void standardForLoop(ArrayList<String> guitarList) {
//        for (int i = 0; i < guitarList.size(); i++) {
//            System.out.println(guitarList.get(i));
//        }
//    }

//    public void skipEverySecondElementForLoop(ArrayList<String> guitarList) {
//        for (int i = 0; i < guitarList.size(); i += 2) {
//            System.out.println(guitarList.get(i));
//        }
//    }

    public void listElementsBackwards(ArrayList<String> guitarList) {
        for (int i = guitarList.size()-1; i >= 0; i--){
            System.out.println(guitarList.get(i));
        }
    }

//    public void addNewElementAfterEveryIteration(ArrayList<String> guitarList) {
//        for (int i = 0; i < guitarList.size(); i++) {
//            System.out.println(guitarList.get(i) + " I'm a Spacer " + guitarList.get(0));
//
//        }
//    }
}


// ToDo:
// list the list backwards & inside own method.
// for loop print normal except after every iteration add new element.
