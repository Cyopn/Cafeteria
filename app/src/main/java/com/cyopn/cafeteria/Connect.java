package com.cyopn.cafeteria;
import java.sql.*;
public class Connect {
    Connection conn = null;
    String ip="192.168.253.176";

public Connect(){
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.conn = DriverManager.getConnection("jdbc:mysql://" + ip + "/?useSSL=FALSE&allowPublicKeyRetrieval=TRUE", "userapp", "caW4630yhs19..");
    } catch (ClassNotFoundException | SQLException e) {
        System.out.println(e);
    }
}
    public Connection getConnect() {
        return this.conn;
    }
}
