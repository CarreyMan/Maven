package com.carrey.manager.controller;

import com.carrey.manager.entity.User;
import com.carrey.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Carrey on 2018/8/13.
 */
@Controller
public class UserController {


    @Autowired
    private UserService userService;
    /**
     *  查询所有
     */
    @RequestMapping("queryUser")
    public List<User> queryUser(){
        return userService.queryAllUser();
    }
}
