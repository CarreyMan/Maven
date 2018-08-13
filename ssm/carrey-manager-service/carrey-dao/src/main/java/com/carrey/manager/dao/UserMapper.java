package com.carrey.manager.dao;


import com.carrey.manager.entity.User;
import org.mybatis.spring.annotation.MapperScan;

import java.util.ArrayList;
@MapperScan
public interface UserMapper {
    /**
     *
     * @mbggenerated 2018-08-13
     */
    int deleteByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2018-08-13
     */
    int insert(User record);

    /**
     *
     * @mbggenerated 2018-08-13
     */
    int insertSelective(User record);

    /**
     *
     * @mbggenerated 2018-08-13
     */
    User selectByPrimaryKey(String id);

    /**
     *
     * @mbggenerated 2018-08-13
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbggenerated 2018-08-13
     */
    int updateByPrimaryKey(User record);

    ArrayList<User> queryAllUser();
}