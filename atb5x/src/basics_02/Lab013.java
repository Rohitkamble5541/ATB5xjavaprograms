package src.basics_02;

public class Lab013 {
    public static void main(String[] args) {

        double a= 34;
        double b=10;

        double mod = a%b;
        // % -> mod -> Reminder
        System.out.println(mod);

        // 10 | 34 | 3
        //    | 30 |
        //----------
        //      4


        double a1= 78;
        double b1=12;

        double mod1 = a%b;
        System.out.println(mod1);

        int num = 38;
        int r = num %2;
        System.out.println(r);

            // num % 2 == 0 -> Even number
            // num % 2 == 1 -> Odd number


    }
}
