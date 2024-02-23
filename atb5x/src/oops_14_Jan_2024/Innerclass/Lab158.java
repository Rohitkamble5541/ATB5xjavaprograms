package src.oops_14_Jan_2024.Innerclass;

public class Lab158 {

    public static void main(String[] args) {

        ooc oc = new ooc();
        ooc.SNCI icref = new ooc.SNCI();
        icref.show();

    }

}

class ooc
{
    static  int o =100;
    int a = 900;


    static class SNCI{

        void show(){
           // System.out.println(a);
            System.out.println(o);
        }
    }

}
