/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package addreval.dao;
import addreval.model.Peminjaman;
import java.sql.*;
import java.util.*;
/**
 *
 * @author ASUS iD
 */
public class PeminjamanDaoImpl implements PeminjamanDao{
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
      String sql = "update peminjaman set tglKembali=?"+ "  where nobp=? and kodeBuku=? and tglPinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getNobp());
        ps.setString(2, peminjaman.getKodeBuku());
        ps.setString(3, peminjaman.getTglPinjam());
        ps.setString(4,peminjaman.getTglKembali());
        ps.executeUpdate();
    }

    @Override
    public void delete(Peminjaman peminjaman) throws SQLException {
      String sql = "delete peminjaman set tglKembali=?"+ "  where nobp=? and kodeBuku=? and tglPinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, peminjaman.getNobp());
        ps.setString(2, peminjaman.getKodeBuku());
        ps.setString(3, peminjaman.getTglPinjam());
        ps.setString(4,peminjaman.getTglKembali());
        ps.executeUpdate();

    }

    @Override
    public Peminjaman getPeminjaman(String kodeBuku) throws SQLException {
      String sql = "select * from peminjaman where kodebuku=?"+ "  where nobp=? and tglkembali=? and tglPinjam=?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodeBuku);
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
        Peminjaman peminjaman = null;
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
