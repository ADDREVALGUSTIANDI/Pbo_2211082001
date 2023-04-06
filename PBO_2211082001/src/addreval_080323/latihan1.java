/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addreval_080323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author addreval
 */
public class latihan1 {
     public static void main (String args []) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
        String str = "";
        int number = 0; int b;
        char character = 0;
        boolean result = true;
        
        try {
            System.out.println("Say Hello!");
            str = dataIn.readLine();
            System.out.println("Write a letter");
            character = dataIn.readLine().charAt(0);
            System.out.println("5 mod 2 = ");
            b = Integer.parseInt(dataIn.readLine());
            if (b == 1)
                result = true;
            else
            {
                result = false;
                System.out.println("the correct answer is 1");
            }
            System.out.println("Insert Number");
            number = Integer.parseInt(dataIn.readLine());
        }
        catch(IOException e) {
            System.out.println("Error!");
            e.printStackTrace();
        }
        System.out.println("\nNumber = "+number);
        System.out.println("Letter = "+character);
        System.out.println("Result = "+result);
        System.out.println("Str = "+str);
    }
}
