package com.dev.customer.dao;

import com.dev.customer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class UserDao {

    @Autowired
    private RestTemplate restTemplate;

    public User queryUserById(Long id) {
        String url = "http://localhost:8081/user/"+id;
        User user = this.restTemplate.getForObject(url, User.class);
        return user;
    }

}
