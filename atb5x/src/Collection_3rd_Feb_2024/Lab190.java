package src.Collection_3rd_Feb_2024;

import java.util.HashSet;
import java.util.Set;

public class Lab190 {
    public static void main(String[] args) {

        Set<String> friuts = new HashSet();
        friuts.add("orange");
        friuts.add("mango");
        friuts.add("banana");
        friuts.add("water melon");
        friuts.add("apple");
        friuts.add("apple");
       // friuts.add(456);
        System.out.println(friuts);
        System.out.println(friuts.size());
        System.out.println(friuts.isEmpty());
        System.out.println(friuts.contains("Mango"));
        //System.out.println(friuts.containsAll(friuts));
    }
}
