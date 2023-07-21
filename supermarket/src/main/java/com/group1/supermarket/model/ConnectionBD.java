package com.group1.supermarket.model;

import java.sql.*;
import javax.swing.JOptionPane;

public class ConnectionBD {

    private Connection connection;
    private String user = "root";
    private String password = "Colombia23*";
    private String dataBaseName = "supermarket";
    private String url = "jdbc:mysql://127.0.0.1:3306/" + dataBaseName;

    public Connection GetConection() {
        try {
            connection = DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Ok connection");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Failed connection" + ex);
        }
        return connection;
    }
}