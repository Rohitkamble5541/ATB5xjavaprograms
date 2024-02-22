package src.oops_13_Jan_2024.Encapsulation;

public class Icicibank {


    // data memebers and variables



    String name ;
    int bal ;



    // parameterised constructor
    public Icicibank(String name, int bal) {
        this.name = name;
        this.bal = bal;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(this.name);
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        if(bal > 0) {
            this.bal = bal;
        }
        else{
            System.out.println("Not allowed!!");
        }

    }





}
