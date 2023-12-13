package com.cyopn.cafeteria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Connect {
    Connection conn = null;
    Statement st = null;
    String ip = "192.168.253.176";
    List<String> ips = new ArrayList<String>();

    public Connect() {
        try {
            Class.forName("org.postgresql.Driver");
            this.conn = DriverManager.getConnection("jdbc:postgresql:" + ip + ":5432/test", "cyopn", "huevo123");
            st = this.conn.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
    }

    public Connection getConnect() {
        return this.conn;
    }

    public void execSelect(String query) {
        Map<String, List<String>> result = new HashMap<>();
        try {
            ResultSet rs = st.executeQuery("SELECT * FROM public.\"" + query + "\"");
            ArrayList<String> rsl = new ArrayList<>();
            if (rs.next()) {
                rsl.add("sucess");
                result.put("status", rsl);
                rsl.remove(0);
                while (rs.next()) {
                    rs.getString("");
                    rsl.add(rs.getString("name"));
                    rsl.add(rs.getString("lastname"));
                    rsl.add(rs.getString("role"));
                    result.put(rs.getString("register"), rsl);
                }
            }
        } catch (SQLException e) {

        }


    }

}
