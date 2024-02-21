package src.oops_07_Jan_2024.Multilevel_inheritance;

public class Lab148 {

    public static void main(String[] args) {

//        Grandfather g = new Grandfather();
//        Father f = new Father();
//        son s = new son();


        //Grandfather g = new son();
//
//
//        Father f = new son();
//        // son s  = new Grandfather();
//        // son s = new Father();
//        son s = new son();

        Grandfather g = new son();
        g.flat3bhk();


        son s = new son();
        s.flat1bhk();
        s.flat2bhk();
        s.flat3bhk();





    }
}
