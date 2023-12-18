package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public class ItemDAOImpl implements ItemDAO{
    @Override
    public boolean saveitem(ItemDTO dto) throws SQLException, ClassNotFoundException {
       return SQLUtil.execute("INSERT INTO Item (code, description, unitPrice, qtyOnHand) VALUES (?,?,?,?)");

    }
    @Override
    public boolean updateItem(ItemDTO dto) throws SQLException, ClassNotFoundException {
       return SQLUtil.execute("INSERT INTO Item (code, description, unitPrice, qtyOnHand) VALUES (?,?,?,?)");
    }
    @Override
    public boolean existItem(String code) throws SQLException, ClassNotFoundException {
       return SQLUtil.execute("SELECT code FROM Item WHERE code=?");
    }
    @Override
    public Object delete(String code) throws SQLException, ClassNotFoundException {
       return SQLUtil.execute("DELETE FROM Item WHERE code=?");
    }
    @Override
    public ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException {
      return SQLUtil.execute("SELECT * FROM Item");
    }
    @Override
    public String generateID() throws SQLException, ClassNotFoundException {
      return SQLUtil.execute("SELECT code FROM Item ORDER BY code DESC LIMIT 1;");
    }
    @Override
    public ItemDTO searchItem(String code) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("SELECT code FROM Item ORDER BY code DESC LIMIT 1;");
    }
}