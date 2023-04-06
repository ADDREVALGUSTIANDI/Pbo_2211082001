/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addreval_150323;
import javax.swing.JOptionPane;

/**
 *
 * @author addreval
 */
public class LatihanNilai2 {
    public static void main(String [] args){
        int a = 0,
            b = 0,
            c = 0;
        int avg;
    
    a = Integer.parseInt (JOptionPane.showInputDialog("nilai 1"));
    b = Integer.parseInt (JOptionPane.showInputDialog("Nilai 2"));
    c = Integer.parseInt (JOptionPane.showInputDialog("Nilai 3"));
    
    avg = (a+b+c)/3;
    
    String msg = "rata-rata "+avg;
    JOptionPane.showMessageDialog(null, msg);
    
    if (avg >= 60){
        String smiley = ":)";
    JOptionPane.showMessageDialog(null, smiley);
    }
    else {
        String nsmiley = ":(";
    JOptionPane.showMessageDialog(null,nsmiley);
    }
    }
}
