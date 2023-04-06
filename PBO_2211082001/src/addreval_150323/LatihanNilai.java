/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addreval_150323;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import javax.swing.JOptionPane;
/**
 *
 * @@author addreval
 */
public class LatihanNilai {
    public static void main (String[]args){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String  nama = "";
        int nilai1;
        int nilai2;
        int nilai3;
        float avg;
        
        
        try {
            System.out.print("Masukkan Nama Anda : ");
            nama = dataIn.readLine();
            System.out.print("Nilai Ujian Pertama : ");
            nilai1 = Integer.parseInt(dataIn.readLine());
            System.out.print("Nilai Ujian Kedua : ");
            nilai2 = Integer.parseInt(dataIn.readLine());
            System.out.print("Nilai Ujian Ketiga: ");
            nilai3 = Integer.parseInt(dataIn.readLine());
            
             System.out.println("Hello "+nama+"!");
             System.out.println("Nilai Pertama anda : "+nilai1);
             System.out.println("Nilai Kedua anda : "+nilai2);
             System.out.println("Nilai Ketiga anda : "+nilai3);
            
            avg = (nilai1+nilai2+nilai3)/3;
            System.out.println("Rata-Rata nilai anda : "+avg);
            
            if(avg >= 60){
                System.out.println("Congratulation");
            }
            else{
                System.out.println("Don't give up :(");
            }
            
        } catch (IOException e) {
            System.out.println("Error!");
        }
     
       
      
    }
}
