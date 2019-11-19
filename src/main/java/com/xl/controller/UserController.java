package com.xl.controller;

import com.xl.domain.User;
import com.xl.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     *查找所有的用户
     *
     * @return
     */
    @RequestMapping("/findAll")
    public List<User> findAll() {

        return userService.findAll();

    }
}
