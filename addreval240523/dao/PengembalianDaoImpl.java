/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addreval240523.dao;

import addreval240523.model.Pengembalian;
import addreval240523.model.Pengembalian;
import java.sql.SQLException;
import java.util.List;
import addreval240523.dao.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author ASUS iD TeK
 */
public class PengembalianDaoImpl implements PengembalianDao{
    
    Connection connection;
    
    public PengembalianDaoImpl(Connection connection){
        this.connection = connection;

    }

    public PengembalianDaoImpl() {
        
    }

    @Override
    public void insert(Pengembalian pengembalian) throws SQLException {
        String sql = "insert into pengembalian values (?,?,?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, pengembalian.getNobp());
        ps.setString(2, pengembalian.getKodeBuku());
        ps.setString(3, pengembalian.getTglPinjam());
        ps.setString(4,pengembalian.getTglDikembalikan());
        ps.setString(5,pengembalian.getTerlambat());
        ps.setString(6,pengembalian.getDenda());
        ps.executeUpdate();
    }

   public void update(Pengembalian pengembalian) throws SQLException {
        String sql = "update pengembalian set tglkembali=? " + "where nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, pengembalian.getTglDikembalikan());
        ps.setString(2, pengembalian.getNobp());
        ps.setString(3, pengembalian.getKodeBuku());
        ps.setString(4,pengembalian.getTglPinjam());
        ps.executeUpdate();
    }

    @Override
    public void delete(Pengembalian pengembalian) throws SQLException {
        String sql = "delete from pengembalian " +"where  nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, pengembalian.getNobp());
        ps.setString(2, pengembalian.getKodeBuku());
        ps.setString(3, pengembalian.getTglPinjam());
        ps.executeUpdate();   
    }
    @Override
    public Pengembalian getPengembalian(String nopb, String kodebuku, String tglPinjam) throws SQLException {
        String sql = "select * from pengembalian " + "where nobp=? and kodebuku=? and tglpinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, nopb);
        ps.setString(2, kodebuku);
        ps.setString(3,tglPinjam);
        ResultSet rs = ps.executeQuery();
        Pengembalian pengembalian = null;
        if(rs.next()){
            pengembalian = new Pengembalian();
            pengembalian.setNobp(rs.getString(1));
            pengembalian.setKodeBuku(rs.getString(2));
            pengembalian.setTglPinjam(rs.getString(3));
        }
        return pengembalian;
    }
    @Override
    public List<Pengembalian> getAll() throws SQLException {
     String sql = "select * from pengembalian";
        PreparedStatement ps = connection.prepareStatement(sql);
        Pengembalian pengembalian;
        ResultSet rs = ps.executeQuery();
        List<Pengembalian> list = new ArrayList<>();
        while(rs.next()){
            pengembalian = new Pengembalian();
            pengembalian.setNobp(rs.getString(1));
            pengembalian.setKodeBuku(rs.getString(2));
            pengembalian.setTglPinjam(rs.getString(3));
            list.add(pengembalian);
        }
        return list;
    }
    
}
