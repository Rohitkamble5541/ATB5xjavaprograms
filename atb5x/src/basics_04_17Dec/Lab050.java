package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab050 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number");
        int First_num = sc.nextInt();
        System.out.println("Enter Second number");
        int Sec_num = sc.nextInt();
        System.out.println("Enter Third number");
        int Third_num = sc.nextInt();

        if (First_num >= Sec_num && First_num >=Third_num)
        {
            System.out.println("First number is max:- " + First_num);
        }
        else if (Sec_num >= First_num && Sec_num >=Third_num )

        {
            System.out.println("Second number is max :- " + Sec_num);
        }

        else
        {
            System.out.println("Third number is max :- " + Third_num);
        }

        sc.close();
    }
}
