package com.gl.springSecurity3.service;

import com.gl.springSecurity3.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> userList = new ArrayList<>();

    public UserService (){
        userList.add(User.builder().username(UUID.randomUUID().toString()).name("ankit").email("ankit@gm,ail.com").build());
        userList.add(User.builder().username(UUID.randomUUID().toString()).name("aman").email("aman@gm,ail.com").build());
        userList.add(User.builder().username(UUID.randomUUID().toString()).name("hello").email("hello@gm,ail.com").build());
        userList.add(User.builder().username(UUID.randomUUID().toString()).name("world").email("world@gm,ail.com").build());
    }

    public List<User> getAllUsers(){
        return this.userList;
    }
}
