package ooplab5;

import java.util.Scanner;

public class inputData {
    private static int MAX = 5;

    public static void main(String[] args) {
        int number [] = new int[MAX];
        System.out.print(number.length);
        //for
        number = inputData(number);

    }//main

    public static void showDataEnchance(int[] number) {
        System.out.println("Data in Array : ");
        for (int val : number)
            System.out.print(val + " ");
    }

    public static void showData(int[] number) {
        System.out.println("Data in Array : ");
        for (int val : number)
            System.out.print(val+" ");

    }

    private static int[] inputData(int[]number){
        Scanner scanner = new Scanner(System.in);
            System.out.print("Enter an integer : ");
            for (int i=0;i<number.length;i++){
                System.out.print("number["+i+"] : ");
                number[i] = scanner.nextInt();
            }
            return number;
    }
}
