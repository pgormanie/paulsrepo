package MentorWork;

import java.util.ArrayList;

public class ListExercise {

    public void addElementToList(String element){
        ArrayList<String> paulList = new ArrayList<>();
        paulList.add(element);
        printElementsList(paulList);
    }

    private void printElementsList(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
