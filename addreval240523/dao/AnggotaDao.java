/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package addreval240523.dao;
import addreval240523.model.*;
import java.sql.*;
import java.util.List;
/**
 *
 * @author ASUS iD TeK
 */
public interface AnggotaDao {
    void insert(Anggota anggota) throws SQLException;
    void update(Anggota anggota) throws SQLException;
    void delete(String nobp) throws SQLException;
    Anggota getAnggota(String nobp) throws SQLException;
    public List<Anggota> getAll() throws SQLException;
}
