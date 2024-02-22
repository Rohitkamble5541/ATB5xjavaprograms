package src.oops_13_Jan_2024.Encapsulation;

public class Lab151 {

    public static void main(String[] args) {

        Student s = new Student();

        s.name ="Rohit";
        s.name="Amol";
        s.print();

        // Getter and setter - Condition Based
        // They should hidden


        Persons personS = new Persons();
        personS.id = 1;
        personS.id = 99;
        personS.id = -1;
        personS.bal = 999;

    }
}
