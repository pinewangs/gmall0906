package com.atguigu.gmall.user.controller;


import com.atguigu.gmall.user.bean.UserInfo;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UerController {


    @Autowired
    UserService userService;



    @RequestMapping("userList")
    @ResponseBody
    public List<UserInfo> userList(){

       // List<UserInfo> userInfos= userService.getUserList();
        List<UserInfo> userInfos =  userService.getUserList();

        return userInfos;
    }
}
