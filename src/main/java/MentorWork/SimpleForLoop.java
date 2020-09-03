package MentorWork;

import java.util.ArrayList;
import java.util.List;

public class SimpleForLoop {
    public String convertListToString(List<String>stringList){
        StringBuilder stringToReturn= new StringBuilder();
        for (int i=0;i< stringList.size();i++){
            stringToReturn.append(stringList.get(i));
        }
        return stringToReturn.toString();
    }

    public static void main(String[] args) {
        SimpleForLoop simpleForLoop = new SimpleForLoop();
        List<String> stringList= new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Hello World");
        stringList.add("Blah");
        String returnString = simpleForLoop.convertListToString(stringList);
        System.out.println(returnString);
    }


}
