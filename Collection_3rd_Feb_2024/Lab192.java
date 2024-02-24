package src.Collection_3rd_Feb_2024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab192 {
    public static void main(String[] args) {

        System.out.println("Printing Set using Tresset ");
        System.out.println("====================");

        Set Courseset = new TreeSet();
        Courseset.add("ATB");
        Courseset.add("MTB");
        Courseset.add("LAPIT");
        Courseset.add("SDET Blueprint");
        Courseset.add("Java for Testers");

        System.out.println(Courseset);

        System.out.println("====================");


        System.out.println("Printing Set using Hashset ");
        System.out.println("====================");

        Set Courseset1 = new HashSet();
        Courseset1.add("ATB");
        Courseset1.add("MTB");
        Courseset1.add("LAPIT");
        Courseset1.add("SDET Blueprint");
        Courseset1.add("Java for Testers");

        System.out.println(Courseset1);


        System.out.println("Printing Set using  LinkdHasset ");
        System.out.println("====================");

        Set Courseset2 = new LinkedHashSet();
        Courseset2.add("ATB");
        Courseset2.add("MTB");
        Courseset2.add("LAPIT");
        Courseset2.add("SDET Blueprint");
        Courseset2.add("Java for Testers");

        System.out.println(Courseset2);


    }
}
