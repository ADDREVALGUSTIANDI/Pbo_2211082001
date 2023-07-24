/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addreval240523.dao;
import addreval240523.model.*;
import addreval240523.dao.*;
import java.util.*;
import java.sql.*;
/**
 *
 * @author ASUS iD TeK
 */
public class PeminjamanDaoImpl implements PeminjamanDao {
    
    Connection connection;
    
    public PeminjamanDaoImpl(Connection connection){
        this.connection = connection;
    }

    public PeminjamanDaoImpl() {
        
    }

    @Override
    public void insert(Peminjaman peminjaman) throws SQLException {
        String sql = "insert into peminjaman values (?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getNobp());
        ps.setString(2, peminjaman.getKodeBuku());
        ps.setString(3, peminjaman.getTglPinjam());
        ps.setString(4,peminjaman.getTglKembali());
        ps.executeUpdate();
    }

    @Override
    public void update(Peminjaman peminjaman) throws SQLException {
        String sql = "update peminjaman set tglkembali=? " + "where nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getTglKembali());
        ps.setString(2, peminjaman.getNobp());
        ps.setString(3, peminjaman.getKodeBuku());
        ps.setString(4,peminjaman.getTglPinjam());
        ps.executeUpdate();
    }

    @Override
    public void delete(Peminjaman peminjaman) throws SQLException {
        String sql = "delete from peminjaman " +"where  nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getNobp());
        ps.setString(2, peminjaman.getKodeBuku());
        ps.setString(3, peminjaman.getTglPinjam());
        ps.executeUpdate();   
    }
    @Override
    public Peminjaman getPeminjaman(String nopb, String kodebuku, String tglPinjam) throws SQLException {
        String sql = "select * from peminjaman " + "where nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nopb);
        ps.setString(2, kodebuku);
        ps.setString(3,tglPinjam);
        ResultSet rs = ps.executeQuery();
        Peminjaman peminjaman = null;
        if(rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setNobp(rs.getString(1));
            peminjaman.setKodeBuku(rs.getString(2));
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
        }
        return peminjaman;
    }
    @Override
    public List<Peminjaman> getAll() throws SQLException {
     String sql = "select * from peminjaman";
        PreparedStatement ps = connection.prepareStatement(sql);
        Peminjaman peminjaman;
        ResultSet rs = ps.executeQuery();
        List<Peminjaman> list = new ArrayList<>();
        while(rs.next()){
            peminjaman = new Peminjaman();
            peminjaman.setNobp(rs.getString(1));
            peminjaman.setKodeBuku(rs.getString(2));
            peminjaman.setTglPinjam(rs.getString(3));
            peminjaman.setTglKembali(rs.getString(4));
            list.add(peminjaman);
        }
        return list;
    }
}    
