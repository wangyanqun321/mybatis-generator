package com.wyq.mybatisgenerator.interfaces.rest;

import com.wyq.mybatisgenerator.application.UserApplicationService;
import com.wyq.mybatisgenerator.domain.User;
import com.wyq.mybatisgenerator.pojo.UserDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserApplicationService userApplicationService;

    @GetMapping("/getUser")
    public UserDO getUser(){
        UserDO user = new UserDO();
        user.setId(2);
        user.setName("lisi");
        user.setAge(19);
        user.setSalary(20200.20);
        userApplicationService.addUser(user);
        return user;
    }

}
