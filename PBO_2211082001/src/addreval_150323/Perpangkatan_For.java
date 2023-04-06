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
public class Perpangkatan_For {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("masukkan angka : ");
    int nilai = in.nextInt();
    System.out.println("masukkan pangkat : ");
    int pkt = in.nextInt();

    int h = 1;

    for (int i = 1; i <= pkt;i++){
    h = h * nilai;
    }
    System.out.println(nilai+ " ^ " + pkt + " = " +h);
     }
}
