package src.oops_13_Jan_2024.accessModifiers.police;

public class Cop {

    public int gun;
    // modifier return name variable

    // para constructor

    public Cop(int refgun)

    {
        this.gun = refgun;

    }

    protected void canIShoot()
    {
        System.out.println("of-course you can shoot");


    }

}
