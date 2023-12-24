package src.basics_03_16Dec;

public class Lab029 {
    public static void main(String[] args) {

        String s1 = "Rohit";
        // String Constant Pool - SCP / String Pool

        // new Operator - Object
        String s2 = new String("Rohit");
        //new operator is used to create the new object for class.
        // It returns of the address of newly created object.
        System.out.println(s2);
        System.out.println(new String("Rohit"));
    }
}
