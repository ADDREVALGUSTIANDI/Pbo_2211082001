/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package addreval.dao;
import addreval.model.Peminjaman;
import java.sql.*;
import java.util.List;
/**
 *
 * @author ASUS iD
 */
public interface PeminjamanDao {
    void insert(Peminjaman peminjaman) throws SQLException;
    void update(Peminjaman peminjaman) throws SQLException;
    void delete(Peminjaman peminjaman) throws SQLException;
    Peminjaman getPeminjaman(String nobp) throws SQLException;
    public List<Peminjaman> getAll() throws SQLException;
}
