/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package addreval240523.dao;

import java.sql.SQLException;
import java.sql.*;
import java.util.List;

import addreval240523.model.*;
/**
 *
 * @author ASUS iD TeK
 */
public interface BukuDao {
    void insert(Buku buku) throws SQLException;
    void update(Buku buku) throws SQLException;
    void delete(String kodeBuku) throws SQLException;
    Buku getBuku(String kodeBuku) throws SQLException;
    public List<Buku> getAll() throws SQLException;
}
