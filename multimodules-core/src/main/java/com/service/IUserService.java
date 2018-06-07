package com.service;


import com.entity.User;

import java.util.List;

/**
 * 用户操作接口
 *
 * @author hackyo
 * Created on 2017/12/3 11:53.
 */
public interface IUserService {


    /**
     * 根据用户名查找用户
     * @param name 用户名
     * @return 用户
     */
    User findUserByName(String name);


    /**
     * 查找所有用户
     * @return 用户列表
     */
    List<User> findAll();

}