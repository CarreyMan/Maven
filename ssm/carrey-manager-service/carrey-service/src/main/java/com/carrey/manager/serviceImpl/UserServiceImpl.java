package com.carrey.manager.serviceImpl;

import com.carrey.manager.dao.UserMapper;
import com.carrey.manager.entity.User;
import com.carrey.manager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Carrey on 2018/8/13.
 */
@Service
public class UserServiceImpl implements UserService{


    @Autowired
    private UserMapper userMapper;
    /**
     *  查询所有
     */
    public List<User> queryAllUser(){
        return userMapper.queryAllUser();
    }
}
