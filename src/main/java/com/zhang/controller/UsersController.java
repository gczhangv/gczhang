package com.zhang.controller;

import com.zhang.pojo.Users;
import com.zhang.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;
    @RequestMapping("login")
    //登录
    public String login(Users users, HttpSession session){
        Users user=usersService.login(users);
        if(user!=null){
            session.setAttribute("user", user);
            return "forward:select";
        }
        return "index";
    }
}
