package com.example.repository;


import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

import static sun.misc.Version.println;

/**
 * Created by esherry on 2018-02-25.
 */
@org.springframework.stereotype.Repository
public class Repository {

    String sql = "select * from user;";
    @Autowired
    private JdbcTemplate userJdbcTemplate;


    public List<User> getUsers() {
        String sql = "SELECT * FROM user";

        List<User> users  = userJdbcTemplate.query(sql,
                new BeanPropertyRowMapper(User.class));
       System.out.println(users+"*******************************8");

        return users;

    }


}
