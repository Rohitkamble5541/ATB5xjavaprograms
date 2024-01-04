package src.oops_07_30Dec;

import java.util.Scanner;

public class Lab116 {

    // main method overloading
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        System.out.println(sc.next());
    }

    public static void main(int a)
    {
        System.out.println("Another main");

    }

    public static void main(int a , int b)
    {
        System.out.println("Another main");

    }

    public static int main(int a , int b , int c)
    {
        return 99;

    }

    //public static void main(String[] args) {

   // }



}
