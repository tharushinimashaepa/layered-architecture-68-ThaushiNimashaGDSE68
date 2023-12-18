package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("SELECT * FROM Customer");
    }

    @Override
    public boolean saveCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {

        return SQLUtil.execute("INSERT INTO Customer (id,name, address) VALUES (?,?,?)");

    }

    @Override
    public Object updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {

        return SQLUtil.execute("UPDATE Customer SET name=?, address=? WHERE id=?");



    }

    @Override
    public boolean existCustomer(String id) throws SQLException, ClassNotFoundException {
       return SQLUtil.execute("SELECT id FROM Customer WHERE id=?");
    }

    @Override
    public Object deleteCustomer(String id) throws SQLException, ClassNotFoundException {
       return SQLUtil.execute("DELETE FROM Customer WHERE id=?");
    }

    @Override
    public String genarateId() throws SQLException, ClassNotFoundException {
       return SQLUtil.execute("SELECT id FROM Customer ORDER BY id DESC LIMIT 1;");
    }
    @Override
    public CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException {
        return SQLUtil.execute("SELECT * FROM Customer WHERE id=?");
    }
}
