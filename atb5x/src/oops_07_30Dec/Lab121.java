package src.oops_07_30Dec;

import java.util.Scanner;

public class Lab121 {

    // Swapping number using third variable
    public static void main(String[] args) {

       // int a = 10;
        //int b = 20;


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number for a :-");
        int a = sc.nextInt();

        System.out.println("Please enter any number for b :-");
        int b = sc.nextInt();

        System.out.println("Before Swapping number A and B:-" + a +"-"+b);

        int temp=a;
        a = b;
       b= temp;

        System.out.println("After Swapping number A and B:-" + a +"-"+b);







    }
}
