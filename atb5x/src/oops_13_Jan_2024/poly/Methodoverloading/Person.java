package src.oops_13_Jan_2024.poly.Methodoverloading;

public class Person {

    // Method OverLoading -> multiple methods with same name, but different argument.

//     String name;
//     int age;
    int gift(int x)
    {
        System.out.println("this is integaer" + x);
        return x;
    }

    void gift(String y)
    {
        System.out.println("this is string :- " + y);

    }

    void gift(double z)
    {
        System.out.println("this is double :- " + z);
    }


}
