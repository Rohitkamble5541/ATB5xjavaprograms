package src.basics_03_16Dec;

public class Lab025 {

    public static void main(String[] args) {

        int a =67;
        //boolean b = !(a>20 || a<678);
        boolean b = !(a>20 && a<678);
        System.out.println(b);
    }
}
