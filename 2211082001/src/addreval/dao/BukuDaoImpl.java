/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addreval.dao;

import addreval.model.Buku;
import java.sql.*;
import java.util.*;

/**
 *
 * @author ASUS iD
 */
public class BukuDaoImpl implements BukuDao{
    Connection connection;
    
    public BukuDaoImpl(Connection connection){
        this.connection = connection;
    }

    public BukuDaoImpl() {
        
    }

    @Override
    public void insert(Buku buku) throws SQLException {
        String sql = "insert into buku values (?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodeBuku());
        ps.setString(2, buku.getJudulBuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4,buku.getPenerbit());
        ps.executeUpdate();
    }

    @Override
    public void update(Buku buku) throws SQLException {
      String sql = "update buku set judulbuku=?, pengarang=?, penerbit=? where kodebuku=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getJudulBuku());
        ps.setString(2, buku.getPengarang());
        ps.setString(3,buku.getPenerbit());
        ps.setString(4, buku.getKodeBuku());
        ps.executeUpdate();
    }

    @Override
    public void delete(String kodeBuku) throws SQLException {
      String sql = "delete from buku where  kodebuku=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodeBuku);
        ps.executeUpdate();   
    }

    @Override
    public Buku getBuku(String kodeBuku) throws SQLException {
      String sql = "select * from buku where kodebuku=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodeBuku);
        ResultSet rs = ps.executeQuery();
        Buku buku = null;
        if(rs.next()){
            buku = new Buku();
            buku.setKodeBuku(rs.getString(1));
            buku.setJudulBuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
        }
        return buku;
    }

    @Override
    public List<Buku> getAll() throws SQLException {
       String sql = "select * from buku";
        PreparedStatement ps = connection.prepareStatement(sql);
        Buku buku = null;
        ResultSet rs = ps.executeQuery();
        List<Buku> list = new ArrayList<>();
        while(rs.next()){
            buku = new Buku();
            buku.setKodeBuku(rs.getString(1));
            buku.setJudulBuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            list.add(buku);
        }
        return list;
    }
    
}
