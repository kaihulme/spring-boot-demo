package com.spe.spring_boot_demo.web;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// creates a new connection to your db
public class DBConnection {

    public Connection getConnection() throws IOException {

        Connection con = null;

        // db url, username and password
        String url = null;
        String user = null;
        String password = null;

        // connect to db
        try{
            con = DriverManager.getConnection(url, user, password);
        }catch (SQLException e){
            System.out.println("SQL Connection fail");
            e.printStackTrace();
        }

        return con;
    }

}