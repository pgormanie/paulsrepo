package MentorWork;

import java.util.ArrayList;

public class ArrayEffectsList {
    public static void main(String[] args) {
        ArrayEffectsList arrayEffectsListNew = new ArrayEffectsList();
        arrayEffectsListNew.getArrayListSize();
    }

    public void getArrayListSize() {
        ArrayList<String> guitarEffectsListNew = new ArrayList<>();
        guitarEffectsListNew.add("Distortion");
        guitarEffectsListNew.add("Chorus");
        guitarEffectsListNew.add("Phaser");
        guitarEffectsListNew.add("Delay");
        guitarEffectsListNew.add("Reverb");

        for (int i = 0; i < guitarEffectsListNew.size(); i++) {
            System.out.println(guitarEffectsListNew.get(i));
        }
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