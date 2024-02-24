package src.oops_20_Jan_2024;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab180 {

    public static void main(String[] args) {
        String path = "C:/a.txt";
        try {
            FileInputStream f = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

