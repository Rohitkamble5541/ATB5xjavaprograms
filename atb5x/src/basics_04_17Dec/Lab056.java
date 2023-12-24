package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab056 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number between 1 to 7 , i will tell you which is day");
        int daynumber = sc.nextInt();

        switch (daynumber)
        {
            case 1 :
            {
                System.out.println("Today is Monday");
                break;
            }

            case 2 :
            {
                System.out.println("Today is Tuesday");
                break;
            }

            case 3 :
            {
                System.out.println("Today is Wednesday");
                break;
            }

            case 4 :
            {
                System.out.println("Today is Thursday");
                break;
            }

            case 5 :
            {
                System.out.println("Today is Friday");
                break;
            }

            case 6 :
            {
                System.out.println("Today is Saturday");
                break;
            }

            case 7 :
            {
                System.out.println("Today is Sunday");
                break;
            }

            default:
            {
                System.out.println("You Entered Invalid Number , please enter number between 1 to 7 only");
                break;
            }


        }

        System.out.println("-------------------End the program----------------------");





    }
}
