package src.oops_07_30Dec;

public class Lab112 {
    public static void main(String[] args) {

         int c = sum(3,4); // 2 arguments
         int c1 = sum(3); // 1 arguments
         int c2 = sum(); // 0 arguments
         System.out.println("sum is two arguments :-" + c);
         System.out.println("sum is 1 argument :-"+c1);
         System.out.println("sum is 0 argument:"+c2);

         sayhello(); // call to the function

    }

    static int sum (int input_1 , int input_2)  // Defination of the function
    {
      return input_1 + input_2;
    }

    static int sum (int input_1)
    {
        return input_1;
    }

    static int sum ()
    {
        return 0;
    }

    static int sum (int input_1,int input_2,int c)
    {
        return input_1 + input_2 + c;
    }

    static void sayhello()
    {
        System.out.println("Say Yes");
    }

}
