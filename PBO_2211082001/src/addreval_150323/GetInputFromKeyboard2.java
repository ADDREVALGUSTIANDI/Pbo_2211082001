/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addreval_150323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/**
 *
 * @@author addreval
 */
public class GetInputFromKeyboard2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String  nama = "";
        int nilai = 0;
        
        try {
            System.out.print("Please Enter Your Name : ");
            nama = dataIn.readLine();
            System.out.print("Nilai Matematika : ");
            nilai = Integer.parseInt(dataIn.readLine());
        } catch (IOException e) {
            System.out.println("Error!");
        }
        System.out.println("Hello "+nama+"!");
        System.out.println("Nilai Matematika : "+nilai);
    }
}
