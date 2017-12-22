package ooplab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

public class myArray2D {
    public static void main(String[] args) {
//        Array 2D
        int [] [] number = new int[2][3];
        number [1] [2] = 100;

    }//main
    private static int[][] InputDatav (int[][] number) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter an integer : ");
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[i].length; j++) {
                System.out.println("number[" + i + "][" + j + "] : ");
                number[i][j] = Integer.parseInt(reader.readLine());

            }

        }
        return number;
    }
}//class
