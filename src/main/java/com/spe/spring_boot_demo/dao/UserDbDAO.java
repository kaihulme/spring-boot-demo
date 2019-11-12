package com.spe.spring_boot_demo.dao;

import com.spe.spring_boot_demo.entity.User;
import com.spe.spring_boot_demo.web.DBConnection;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// implements UserDAO methods
public class UserDbDAO implements UserDAO {

    private DBConnection dbConnection;

    // constructor for UserDbDAO
    public UserDbDAO(DBConnection d){
        dbConnection = d;
    }

    // uses result sets to get all users from db with SQL statement
    @Override
    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        try{
            Connection con = dbConnection.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM User");
            while (rs.next()){
                User u = new User(rs.getLong("id"),rs.getString("firstName"));
            }
            con.close();
        }catch (SQLException | IOException e){
            e.printStackTrace();
        }
        return users;
    }

}
