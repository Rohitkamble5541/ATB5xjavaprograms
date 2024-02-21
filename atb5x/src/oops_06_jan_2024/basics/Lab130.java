package src.oops_06_jan_2024.basics;

public class Lab130 {

    public static void main(String[] args)
    {
        String name = "Rohit"; // String constant Pool
        String name2 = new String("Rohit"); // Heap area

        name = "Kamble";

        String str1 = "Hello";
        str1  = str1.concat("Rohit");
        System.out.println(str1);

    }
}
