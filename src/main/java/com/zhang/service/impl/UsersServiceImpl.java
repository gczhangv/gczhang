package com.zhang.service.impl;

import com.zhang.mapper.UsersMapper;
import com.zhang.pojo.Users;
import com.zhang.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    UsersMapper usersMapper;
    //登录

    public Users login(Users users) {
        // TODO Auto-generated method stub
        return usersMapper.login(users);
    }
}
