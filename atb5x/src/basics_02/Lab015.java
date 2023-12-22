package src.basics_02;

public class Lab015 {

    public static void main(String[] args) {

        // Esacape Characters

        char c = '\n' ; // New Line
        char c1 = '\t'; // Add Tab
        char c3 = '\b'; // Backslash , delete 1 character
        char c4 = '\r'; // delete first text i.e. Rohit , Carriage Return

        System.out.println("Rohit" + c4 + "Kamble" );
        System.out.println("Rohit\t Kamble");
        System.out.println("Rohit\"k");
        System.out.println("Rohit\'k");
    }
}
