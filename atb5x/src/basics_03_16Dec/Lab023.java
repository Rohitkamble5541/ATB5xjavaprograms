package src.basics_03_16Dec;

public class Lab023 {
    public static void main(String[] args) {

        // OR operator

        // T || T -> T
        // T || F -> T
        // F || T -> T
        // F || F -> F


        System.out.println(true || true);
        System.out.println(false || true);
        System.out.println(true || false);
        System.out.println(true || false);

        System.out.println("_______________________");

        // && AND operator

        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true && true);
        System.out.println(false && true);
        System.out.println(true && false);
        System.out.println(false && false);


    }
}
