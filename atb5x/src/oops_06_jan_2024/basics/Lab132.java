package src.oops_06_jan_2024.basics;

public class Lab132 {
    public static void main(String[] args) {

        String s1 = "Rohit";
        String s2 = new String("Rohit");
        String s3 = new String("rohit");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));


    }
}
