package src.oops_06_jan_2024.basics;

public class Lab131 {
    public static void main(String[] args) {

        String name = "Rohit";
        System.out.println(name.concat(" Kamble"));
        System.out.println(name + " Kamble");
        System.out.println(name.contains("o"));
        System.out.println(name);

        String name2 = new String("Kamble");

        String expected_Result = "password@123";
        String actual_Result ="Password@123";

        if (expected_Result.equalsIgnoreCase(actual_Result))
        {
            System.out.println("Yes its equal");
        }

    }
}
