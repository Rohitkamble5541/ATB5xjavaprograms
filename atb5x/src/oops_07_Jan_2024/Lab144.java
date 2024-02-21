package src.oops_07_Jan_2024;

public class Lab144 {

    public static void main(String[] args) {


        BankAccount sbi = new BankAccount();
        sbi.printdetails();

        System.out.println("---------------");


        BankAccount axis = new BankAccount("axis" , "axis001",500000);
        axis.printdetails();

        System.out.println("---------------");


        BankAccount icici = new BankAccount("icici" , "icici006" , 600000);
        icici.bankcode = "icici007"; // latest value
        icici.printdetails();
    }
}
