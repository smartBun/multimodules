package com.service.impl;

import com.dao.UserMapper;
import com.entity.User;
import com.entity.UserExample;
import com.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByName(String name) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(name);
        List<User> users = userMapper.selectByExample(userExample);
        return users.get(0);
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectByExample(null);
    }
}