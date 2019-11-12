package com.spe.spring_boot_demo.dao;

import com.spe.spring_boot_demo.entity.User;
import java.util.List;

// user data access object
public interface UserDAO {

    // gets a list of all users in db
    List<User> getAllUsers();

}
