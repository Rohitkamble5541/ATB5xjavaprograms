package src.basics_02;

public class Lab007 {

    /**
     * Author - Rohit Kamble
     * Program - Showcase difference between println vs print
     */
    public static void main(String[] args) {
        System.out.print("Hello");
        System.out.println("Rohit");

        int age =31;
        // System.out.println("Your age is" + age);
        // %d -> any integer - byte , short , int or long
        // %s -> String
        //%c -> character
        //%f -> float
        System.out.printf("Your Age is %d", age);
    }
}
