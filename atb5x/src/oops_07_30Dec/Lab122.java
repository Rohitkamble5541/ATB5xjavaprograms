package src.oops_07_30Dec;

import java.util.Scanner;

public class Lab122 {

    // Swapping number without using third variable

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number for a :-");
        int a = sc.nextInt();

        System.out.println("Please enter any number for b :-");
        int b = sc.nextInt();

        System.out.println("Before Swapping number A and B:-" + a +"-"+b);

        a= a+b;
        b=a-b;
        a=a-b;

        System.out.println("After Swapping number A and B:-" + a +"-"+b);

    }
}
