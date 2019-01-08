package com.atguigu.gmall.user.service;

import com.atguigu.gmall.user.bean.UserInfo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {


    public List<UserInfo> getUserList();
}
