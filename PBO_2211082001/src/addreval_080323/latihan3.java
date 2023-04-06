/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addreval_080323;

/**
 *
 * @author addreval
 */
public class latihan3 {
    public static void main(String[] args){
        int n1 = 10;
        int n2 = 23;
        int n3 = 5;
        int max;

        max = (n1>=n2)?n1:n2;
        max = (n3>=max)?n3:max;
        System.out.print("Nilai Maksimum = "+max);
    }
}
