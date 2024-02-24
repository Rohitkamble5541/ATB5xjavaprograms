package src.Collection_3rd_Feb_2024;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Lab191 {
    public static void main(String[] args) {


        Set sourselang = new HashSet();
        sourselang.add("C");
        sourselang.add("C++");
        sourselang.add("Java");
        sourselang.add("Python");
        sourselang.add("perl");
        sourselang.add("Cobol");
        sourselang.add("HTML");
        sourselang.add("CSS");
        sourselang.add("JavaScript");
        System.out.println(sourselang);
        System.out.println("=======================");

        System.out.println("printed using for each loop");

        // for each loop
        for (Object o : sourselang ) {
            System.out.println(o);

        }
        System.out.println("=========================");

        System.out.println("printed using iterator");

        // Iterator

        Iterator it = sourselang.iterator();
        {
            while (it.hasNext())
            {
                System.out.println(it.next());
            }
        }

    }
}
