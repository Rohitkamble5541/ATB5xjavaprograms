package src.oops_20_Jan_2024;

import java.util.Collections;
import java.util.List;

public class Lab183 {

    public static void main(String[] args) {
        // Collection Framework

        // Collections Framework
        List fruites = List.of("orange", "apple", "bananda", "apple", "waterleon");
        List shopping_items = List.of("AATA", "MILK", "BREAD", "butter", "choc silk");
        List my_10th_makrs = List.of(91, 92, 93, 95, 100);
        List different_data_types = List.of("Pramod",true,123);

        System.out.println(fruites.get(0));
        System.out.println(fruites.size());
        System.out.println(fruites);
        System.out.println(fruites.indexOf("bananda"));


        // IsEmpty
        System.out.println(fruites.isEmpty());
        //fruites.add("pramod");
        fruites.remove("pramod");
        // ArrayList, LinkedList, - Add or Replcae anything - Full Auth




    }
}