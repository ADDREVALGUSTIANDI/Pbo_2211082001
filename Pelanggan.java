/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_A.Model;

/**
 *
 * @author ASUS
 */
public class Pelanggan {
    private String KodePelanggan;
    private String Nama;
    private String MeterBulanIni;
    private String MeterBulanLalu;
    private String Tarif;
    private String Diskon;

    
    public Pelanggan(){}
    
    public Pelanggan(String KodePelanggan, String Nama, String MeterBulanIni, String MeterBulanLalu, String Tarif, String Diskon){
        this.KodePelanggan = KodePelanggan;
        this.Nama = Nama;
        this.MeterBulanIni = MeterBulanIni;
        this.MeterBulanLalu = MeterBulanLalu;
        this.Tarif = Tarif;
        this.Diskon = Diskon;
    }
    
    public void setKodePelanggan(String KodePelanggan){
        this.KodePelanggan = KodePelanggan;
    }
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setMeterBulanIni(String MeterBulanIni){
        this.MeterBulanIni = MeterBulanIni;
    }
    public void setTarif(String Tarif){
        this.Tarif = Tarif;
    }
    public void setMeterBulanLalu(String MeterBulanLalu){
        this.MeterBulanLalu = MeterBulanLalu;
    }
    public void setDiskon(String Diskon){
        this.Diskon = Diskon;
    }
    public String getKodePelanggan(){
        return KodePelanggan;
    }
    public String getNama(){
        return Nama;
    }
    public String getMeterBulanIni(){
        return MeterBulanIni;
    }
    public String getMeterBulanLalu(){
        return MeterBulanLalu;
    }
    public String getTarif(){
        return Tarif;
    }
    public String getDiskon(){
        return Diskon;
    }
    
}
    

