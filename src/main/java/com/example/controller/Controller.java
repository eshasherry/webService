package com.example.controller;


import com.example.model.User;
import com.example.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by esherry on 2018-02-25.
 */
@RestController
public class Controller {

@Autowired
Service service;

    @RequestMapping(value = "/")
    public @ResponseBody List<User> getUser(){
        List<User> user= new ArrayList<User>();
       // user.add(new User("Esha","Sherry"));
        user= service.getAllUsers();
//comment
        return user;
    }
}
