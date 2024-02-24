package src.oops_21_Jan_2024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab192 {
    public static void main(String[] args) {

        List<Integer> myMakrs = new ArrayList<>();
        myMakrs.add(91);
        myMakrs.add(87);
        myMakrs.add(80);
        Collections.sort(myMakrs);
        System.out.println(myMakrs);


    }
}

