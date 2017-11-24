package ooplab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testinput {
    public static void main(String[] args) throws IOException {



//        BufferedReader
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("What is name? : ");
        String name = reader.readLine();
        System.out.print("Your name is "+name);

    }//main

}//class
