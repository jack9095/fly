package com.example.fly.service;

import com.example.fly.bean.Person;
import com.example.fly.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    public Person Sel(int id){
        return userMapper.Sel(id);
    }

}
