package com.dev.customer.controller;

import com.dev.customer.pojo.User;
import com.dev.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("customer")
public class customerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/list")
    public List<User> queryListUser(@RequestParam("ids") Long... ids) {

        return this.customerService.queryUserListByIds(ids);
    }
}
