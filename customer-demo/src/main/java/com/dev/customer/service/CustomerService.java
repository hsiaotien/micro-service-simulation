package com.dev.customer.service;

import com.dev.customer.dao.UserDao;
import com.dev.customer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private UserDao userDao;

    public List<User> queryUserListByIds(Long... ids) {
        List<User> listUser = new ArrayList<>();
        for (Long id : ids) {
            User user = this.userDao.queryUserById(id);
            listUser.add(user);
        }
        return listUser;
    }
}
