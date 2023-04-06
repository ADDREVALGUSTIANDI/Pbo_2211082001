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
public class Perpangkatan_DoWhile {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("masukkan angka : ");
     int angka = in.nextInt();
     System.out.println("masukkan pangkat : ");
     int pangkat = in.nextInt();

     int i = 1;
     int h = 1;

     do {
     h = h*angka;
     i++ ;
     }while(i<=pangkat);
     System.out.println(angka +" ^ " + pangkat + " = " +h);
    }
}
