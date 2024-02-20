package src.oops_07_30Dec;

public class Lab128 {
    public static void main(String[] args) {
        // reverse string


        String name = "Rohit";
        char[] char_array1 = name.toCharArray();
        System.out.println(char_array1.length);

        // op -> tihoR
    int left = 0;
    int right = char_array1.length-1;

    while (left<right)
    {
        char temp = char_array1[left];
        char_array1 [left] = char_array1[right];
        char_array1[right]=temp;

        left++;
        right--;
    }

        String rev_name = new String (char_array1);
        System.out.println(rev_name);


    }
}
