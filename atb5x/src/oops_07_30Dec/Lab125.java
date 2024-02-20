package src.oops_07_30Dec;

public class Lab125 {

    public static void main(String[] args) {

        /*
        print diagonal element in 2d array

        |1 2 3|
        |4 5 6|
        |7 8 9|
         */

        int[][] array1 = new int[3][3];

        // initialise the value

         array1[0][0] = 1;
         array1[0][1] = 2;
         array1[0][2] = 3;

         array1[1][0] = 4;
         array1[1][1] = 5;
         array1[1][2] = 6;

         array1[2][0] = 7;
         array1[2][1] = 8;
         array1[2][2] = 9;

        for (int i = 0; i < array1.length; i++) // row

        {
            System.out.println(array1[i][i]);


            }
    }
}

