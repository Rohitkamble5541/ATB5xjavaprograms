package src.oops_13_Jan_2024.poly.Methodoverriding;

public class RC {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.bark();

        maggie m = new maggie();
        m.bark();

        Dog d1 = new maggie();  // Dynamic dispatch
        // Runtime polymorphism
        d1.bark();

        //Hound a = new Dog(); // Java 22 This is not possible
        // Latest java 22 - It is never possible in JAVA


    }
}
