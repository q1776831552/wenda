package com.company.wenda.service;

import com.company.wenda.mapper.UserMapper;
import com.company.wenda.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Userservice {
    @Autowired
    UserMapper userMapper;
    public User getUserById(int id) {
        return userMapper.selectUserById(id);
    }
}
