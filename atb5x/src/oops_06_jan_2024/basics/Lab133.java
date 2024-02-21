package src.oops_06_jan_2024.basics;

public class Lab133 {

    public static void main(String[] args) {

        // there are 4 ways to create a string
        // Immutable in nature (that can't changed)

        String s1 = "Rohit";
        String s2 = new String("Rohit");



        // Mutable - that can be changed!!

        StringBuilder  sb = new StringBuilder("Rohit");
        StringBuffer sbuf4 = new StringBuffer("Rohit");


        StringBuilder s3 = new StringBuilder("Rohit");
        s3.append(" Kamble");
        System.out.println(s3);


        StringBuilder s4 = new StringBuilder("Prakash");
        s4.append(" Gavali");
        System.out.println(s4);
    }
}
