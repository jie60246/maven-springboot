package com.bbk.service.impl;

import com.bbk.dao.UserDaoMapper;
import com.bbk.entity.User;
import com.bbk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDaoMapper userDaoMapper;

    @Override
    public List<User> queryUser() {
        return userDaoMapper.queryUser();
    }

    @Override
    public int addUser() {
        return 0;
    }

    @Override
    public int deleteUser(User user) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }
}
