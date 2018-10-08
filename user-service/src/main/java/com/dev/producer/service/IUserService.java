package com.dev.producer.service;

import com.dev.producer.pojo.User;

public interface IUserService {

    User findUserById(Long id);
}
