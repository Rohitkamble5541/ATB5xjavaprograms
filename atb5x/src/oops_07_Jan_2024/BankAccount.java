package src.oops_07_Jan_2024;

public class BankAccount {


    String bankname ;
    int balance ;

    String bankcode;


    // default consutructor
    BankAccount()
    {
        bankname ="SBI";
        balance = 50000;
        bankcode = "SBI007";
        System.out.println("Default constructor");
    }

    BankAccount(String bName , String bcode , int b_balance)
    {
        this.bankname = bName;
        this.bankcode = bcode;
        this.balance = b_balance;
        System.out.println("parameterised constructor");

    }


    void printdetails()
    {
        System.out.println("BankName :- "+ bankname);
        System.out.println("Balance :- " + balance);
        System.out.println("Bankcode:-" + bankcode);
    }
}
