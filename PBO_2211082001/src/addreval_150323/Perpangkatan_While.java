/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addreval_150323;
import java.util.Scanner;
/**
 *
 * @author addreval
 */
public class Perpangkatan_While {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("masukkan angka : ");
     int input = in.nextInt();

     System.out.println("masukkan pangkat : ");
     int pangkat = in.nextInt();

     int i = 1;
     int h = 1;

     while (i<=pangkat){
     h = h*input;
     i++;
     }
     System.out.println(input + " ^ " +pangkat +" = " +h);

     }

    
}
