package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab058 {

    public static void main(String[] args) {

        // program for checking vowels

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any character i will tell you its vowel or not");
        String vowel = sc.next();
        //vowel.toLowerCase();

        switch (vowel.toLowerCase())
        {
            case "a" :
            {
                System.out.println("a is a vowel ");
                break;
            }

            case "e" :
            {
                System.out.println("e is a vowel ");
                break;
            }

            case "i" :
            {
                System.out.println("i is a vowel ");
                break;
            }

            case "o" :
            {
                System.out.println("o is a vowel ");
                break;
            }

            case "u" :
            {
                System.out.println("u is  vowel ");
                break;
            }

            default:
                System.out.println("Its not vowel , its a consonant ");
                break;


        }
        System.out.println("---------------------End of the program--------------------------------------");
    }
}
