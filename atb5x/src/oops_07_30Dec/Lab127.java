package src.oops_07_30Dec;

import java.util.Scanner;

public class Lab127 {

    public static void main(String[] args) {


        // Prime Number Condition num%i(i -> 2 to num) == 0 -> x
        //  0 -> X
        // 1 -> X
        // 2 -> prime?
        // 3 -> ?
        // 4 -> ?

        int i=0;
        int flag=0;
        int m=0;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();

        m=num/2;

        if (num == 0 || num==1) {
            System.out.println("not a prime number:-" + num);
            
        }

        else
        {
            for (i = 2; i <=num ; i++)
            {
                if (num % i  == 0)
                {
                    System.out.println("not a prime number:-"+ num);
                    flag =1;
                    break;
                }



            }

        }
        if (flag == 0)
        {
            System.out.println("This is prime number:-"+ num);
            
        }



    }
}
