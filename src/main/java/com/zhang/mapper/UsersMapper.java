package com.zhang.mapper;

import com.zhang.pojo.Users;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper {
    //登录
    Users login(Users users);
}
