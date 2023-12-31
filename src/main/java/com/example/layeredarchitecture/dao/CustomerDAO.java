package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
     ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;
     boolean saveCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException ;
     Object updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException ;
     boolean existCustomer(String id) throws SQLException, ClassNotFoundException ;
     Object deleteCustomer(String id) throws SQLException, ClassNotFoundException ;
     String genarateId() throws SQLException, ClassNotFoundException ;
     public CustomerDTO searchCustomer(String id) throws SQLException, ClassNotFoundException;
}
