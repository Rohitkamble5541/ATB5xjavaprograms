package src.oops_07_Jan_2024.Inheritance;

public class Programming {

    //

    String language ;
    int version ;


    Programming ()
    {
        System.out.println("programming Default constructor called");
    }

    Programming (String reflang , int refversion)
    {
        System.out.println("programming Parameterised constructor called");
        this.language=reflang;
        this.version=refversion;
    }


    void printinfo()
    {
        System.out.println("Programming language is:-" + this.language);
        System.out.println("Programming Author name is:-" + this.version);
    }

    void car()
    {
        System.out.println("lamborgini");
    }

    void _3bhk()
    {
        System.out.println("3bhk");
    }
}
