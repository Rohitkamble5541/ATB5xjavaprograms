package src.oops_07_Jan_2024;

public class ATBPerson {



    // attributes
    String name; // instance  variable values are default
    long phone;
    String email;
    boolean isMarried;
    String courseName;

    // Default Constructor
    ATBPerson(){
        courseName = "ATB";
        System.out.println("I am Default!");
    }

    // Param Constructor
    ATBPerson(String valuefromObjectRef){
        this.name = valuefromObjectRef;
    }



    // behaviour
    void talk(){
        System.out.println(" Talk!!");
    }

    void printDetails(){
        System.out.println(this.name);
        System.out.println(courseName);
    }

}