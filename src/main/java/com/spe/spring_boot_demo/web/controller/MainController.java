package com.spe.spring_boot_demo.web.controller;

import com.spe.spring_boot_demo.dao.UserDAO;
import com.spe.spring_boot_demo.dao.UserDbDAO;
import com.spe.spring_boot_demo.entity.User;
import com.spe.spring_boot_demo.web.DBConnection;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@SpringBootApplication
@Controller
public class MainController{

    // new user data access object using new db connection
//    private UserDAO userDAO = new UserDbDAO(new DBConnection());

    // mapping for '/' which adds all users to model as 'users'
    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String index(Model m) {
//        List<User> users = userDAO.getAllUsers();
//        m.addAttribute("users", users);
        return "index";
    }

}