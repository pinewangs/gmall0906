package com.atguigu.gmall.user.mapper;

import com.atguigu.gmall.user.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;

public interface UserInfoMapper extends Mapper{
    public List<UserInfo> getSlectUserList();



}
