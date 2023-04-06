/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addreval_150323;
import java.io.*;
/**
 *
 * @author addreval
 */
public class BacaBilangan {
    public static void main(String[] args) {
    BufferedReader dataIn = new BufferedReader(new InputStreamReader (System.in));
    String num = "";

    System.out.println("masukkan angka dari 1-10");

    try {
     num = dataIn.readLine();
    }
    catch(IOException e){
        System.out.println("error!");
    }
    int i = Integer.parseInt(num);

    if (i == 1){
        System.out.println("satu");
    }
    else if (i == 2){
        System.out.println("dua");
    }
    else if (i == 3){
        System.out.println("tiga");
    }
    else if (i == 4){
        System.out.println("empat");
    }
    else if (i == 5){
        System.out.println("lima");
    }
    else if (i == 6){
        System.out.println("enam");
    }
    else if (i == 7){
        System.out.println("tujuh");
    }
    else if (i == 8){
        System.out.println("delapan");
    }
    else if (i == 9){
        System.out.println("sembilan");
    }
    else if (i == 10){
        System.out.println("sepuluh");
    }
    else {
        System.out.println("invalid number!");
    }
    }
    }
