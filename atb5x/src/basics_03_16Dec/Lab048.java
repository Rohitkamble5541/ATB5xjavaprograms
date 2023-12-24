package src.basics_03_16Dec;

import java.util.Scanner;

public class Lab048 {

    // Take two input from user and give max out of two number

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter First number");
        int First_num = sc.nextInt();
        System.out.println("Please enter Second number");
        int Second_num = sc.nextInt();



        if (First_num > Second_num)
        {
            System.out.println("First number is max number :- " + First_num);
        }

        else
        {
            System.out.println("Second number is max number :- " +Second_num);

        }




    }
}
