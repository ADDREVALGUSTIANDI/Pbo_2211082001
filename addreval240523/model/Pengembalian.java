/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addreval240523.model;

/**
 *
 * @author ASUS iD TeK
 */
public class Pengembalian {
    private String nobp;
    private String kodeBuku;
    private String tglPinjam;
    private String tglDikembalikan;
    private String terlambat;
    private String denda;
    
    public Pengembalian(){
    
    }
    public Pengembalian (String nobp, String kodeBuku, String tglPinjam, String tglDikembalikan, String terlambat, String denda){
        this.nobp = nobp;
        this.kodeBuku = kodeBuku;
        this.tglPinjam = tglPinjam;
        this.tglDikembalikan = tglDikembalikan;
        this.terlambat = terlambat;
        this.denda = denda;
    }

    public String getNobp() {
        return nobp;
    }

    public void setNobp(String nobp) {
        this.nobp = nobp;
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public String getTglPinjam() {
        return tglPinjam;
    }

    public void setTglPinjam(String tglPinjam) {
        this.tglPinjam = tglPinjam;
    }

    public String getTglDikembalikan() {
        return tglDikembalikan;
    }

    public void setTglDikembalikan(String tglDikembalikan) {
        this.tglDikembalikan = tglDikembalikan;
    }

    public String getTerlambat() {
        return terlambat;
    }

    public void setTerlambat(String terlambat) {
        this.terlambat = terlambat;
    }

    public String getDenda() {
        return denda;
    }

    public void setDenda(String denda) {
        this.denda = denda;
    }
    
}
