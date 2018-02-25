package com.example.model;

import javax.jws.soap.SOAPBinding;

/**
 * Created by esherry on 2018-02-25.
 */
public class User {
    private String first_name;
    private String lastname;

    public User(){
    }
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
