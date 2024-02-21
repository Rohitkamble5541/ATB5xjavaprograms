package src.oops_07_Jan_2024;

public class Dog {

    String name;


    // default constructor

    Dog()
    {
        System.out.println("This is default constructor");
    }

    Dog( String RefName)
    {
        this.name = RefName;
        System.out.println("This is Parameterised constructor");
    }

    void bark()
    {
        System.out.println("Name of the dog is :- " + this.name);

    }

}
