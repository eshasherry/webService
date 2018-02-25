package com.example.service;

import com.example.model.User;
import com.example.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by esherry on 2018-02-25.
 */
@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repository;

    public List<User> getAllUsers(){
        return repository.getUsers();
    }
}
