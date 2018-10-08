package com.dev.producer.service.impl;

import com.dev.producer.mapper.UserMapper;
import com.dev.producer.pojo.User;
import com.dev.producer.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    
    @Override
    public User findUserById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }
}
