package MethodsClasses;

import java.util.ArrayList;     // getArrayListSize

public class ArrayListDemo {
//    private static int size;

    public static void main(String args[]) {
        ArrayListDemo arrayListDemoNew = new ArrayListDemo();
        arrayListDemoNew.getArrayListSize();
    }

    public int getArrayListSize() {
        ArrayList<String> guitarListNew = new ArrayList<>();
        guitarListNew.add("Fender");    // index 0
        guitarListNew.add("Gibson");    // index 1
        guitarListNew.add("Ibanez");    // index 2
        guitarListNew.add("Gretsch");   // index 3
        guitarListNew.add("blah");      // index 4

//        size = guitarListNew.size();    // call the size method and assign the value to size variable
//        System.out.println("Total: " + size);   // Print out value of size
//        System.out.println(guitarListNew);  // Print the values within the array
//        System.out.println(guitarListNew.size());  // Print the size of the array

        // Start iterating the array starting at 0 index
        // keep iterating until i is less than guitarListNew.SIZE, i.e. 4
        // increment 1 for each loop

        for (int i = 0; i < guitarListNew.size(); i++) {
            System.out.println(guitarListNew.get(i));   // Print out each value in the guitarListNew array
            System.out.println("I value is " + i);      // Print the value of i for every loop
        }
        return 0;
    }
}