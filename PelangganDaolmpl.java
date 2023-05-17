/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.Model;

import UTS_A.Model.Pelanggan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class PelangganDaolmpl implements PelangganDao{

    List<Pelanggan> data = new ArrayList<>();
    
    public void save(Pelanggan pelanggan){
        data.add(pelanggan);
    }
    public void update(int index,Pelanggan pelanggan){
        data.set(index, pelanggan);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Pelanggan getPelanggan(int index){
        return data.get(index);
    }
    public List<Pelanggan> getAllPelanggan(){
        return data;
    }
}

    

