package MethodsClasses;

import java.util.ArrayList;

public class ArrayLoopHomework {

    public static void main(String[] args) {
        ArrayLoopHomework arrayLoopHomeworkNew = new ArrayLoopHomework();
        arrayLoopHomeworkNew.getArrayListSize();
    }

    public int getArrayListSize() {
        ArrayList<String> carArrayListNew = new ArrayList<>();
        carArrayListNew.add("Ford");
        carArrayListNew.add("BMW");
        carArrayListNew.add("AUDI");
        carArrayListNew.add("Peugeot");

        for (int i = 0; i < carArrayListNew.size(); i++) {
            System.out.println(carArrayListNew.get(i));
        }
        return 0;
    }

}


//public class PaulsClass
// - psvm Main Method
//    - new PaulsClassNew instance of the PaulsClass
//    - PaulsClassNew.newMethodCalc
//
// - public int newMethodCalcSizeOfArray
//    - new ArrayListNew instance of the ArrayList
//    - build array list using .add
//    - for loop
