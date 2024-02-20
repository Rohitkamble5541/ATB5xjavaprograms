package src.oops_07_30Dec;

import java.util.Scanner;

public class Lab123 {

    // Swapping number multipication and division or using bitwise xor

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number for a :-");
        int a = sc.nextInt();

        System.out.println("Please enter any number for b :-");
        int b = sc.nextInt();

        System.out.println("Before Swapping number A and B:-" + a +"-"+b);

        a= a*b;
        b=a/b;
        a=a/b;


        // bitwise xor  bitwise and xor gate
        //a= a^b;
        //b=a^b;
        // a=a^b;

        System.out.println("After Swapping number A and B:-" + a +"-"+b);

    }
}
