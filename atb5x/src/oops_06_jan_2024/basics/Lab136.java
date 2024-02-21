package src.oops_06_jan_2024.basics;

public class Lab136 {

    public static void main(String[] args)
    {
        // If something is Thread Safe, we avoid!
        // StringBuffer vs StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Rohit");
        stringBuilder.reverse();
        System.out.println(stringBuilder);


    }
}
