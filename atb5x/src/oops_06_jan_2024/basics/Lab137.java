package src.oops_06_jan_2024.basics;

import java.util.Scanner;

public class Lab137 {

    public static void main(String[] args) {

        // check palindrome string

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String, I will check for Palindrome");
        String user_input = sc.next();
//        user_input = user_input.toLowerCase();
        boolean result = ispalindrome(user_input);
        if(result){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

    }

    static boolean ispalindrome(String userInput) {
        String original_str = userInput; //Pramod , naman
        StringBuilder sb = new StringBuilder(userInput);
        String reverse_string = sb.reverse().toString(); // domarP , naman
        return original_str.equalsIgnoreCase(reverse_string); // domarp == Pramod , true
    }
}