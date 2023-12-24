package src.basics_04_17Dec;

import java.util.Scanner;

public class Lab057 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your browser name e.g. chrome , firefox , edge , safari");
        String browser = sc.next();
       // browser.toLowerCase();

        switch (browser.toLowerCase())
        {
            case "chrome" :
                System.out.println("your code is executed in chrome browser");
                break;

            case "firefox" :
                System.out.println("your code is executed in firefox browser");
                break;

            case "edge" :
                System.out.println("your code is executed in edge browser");
                break;

            case "safari" :
                System.out.println("your code is executed in safari browser");
                break;

            default:
                System.out.println("You entered invalid browser name , please enter only chrome , firefox , edge , safari browser names");
                break;




        }





    }
}
