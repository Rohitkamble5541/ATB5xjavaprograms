package src.oops_20_Jan_2024;

import java.util.ArrayList;
import java.util.List;

public class Lab184 {

    public static void main(String[] args) {

        // List mylist = new List();
        List mylist = new ArrayList();
        mylist.add("Rohit");
        mylist.add("123");
        mylist.add("55.4");
        mylist.add(66845.5623);
        mylist.add('R');
        mylist.add("Abhishek");

        System.out.println(mylist);
        System.out.println("size of the mylist is :- "+ mylist.size());
        System.out.println(mylist.get(2));
        System.out.println(mylist.isEmpty());
        System.out.println(mylist.contains("55.4"));
        System.out.println(mylist.getFirst());
        System.out.println(mylist.getLast());
        System.out.println(mylist.set(4,"P"));
        System.out.println(mylist.remove(4));
        mylist.add("Varsha");


        System.out.println("---------------------------");


        for (int i = 0; i <mylist.size() ; i++) {
            System.out.println(mylist.get(i));

        }

        System.out.println("---------------------------");

        for (Object o : mylist)
        {
            System.out.println(o);
        }








    }
}
