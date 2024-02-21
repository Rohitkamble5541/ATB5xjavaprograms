package src.oops_07_Jan_2024.Inheritance;

public class Java extends Programming {

String newfeature;

// default constuctor
Java()
{
    System.out.println("java default consturctor");
}

// parameterised constructor
Java(String ref_newfeature)
{
    this.newfeature =ref_newfeature;

}




    void printinfo()
    {
        System.out.println("Feature is:-" + this.newfeature);

    }

    //    int version;
//    String author;

//    Programming(){
//        System.out.println("DC");
//    }
//
//    Programming(String author, int version){
//        this.author = author;
//        this.version = version;
//    }
//
//    void printInfo(){
//        System.out.println(" Program Info ->  "+ this.version + " Author " + this.author);
//
//    }
}

