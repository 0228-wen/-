package com.zdw.Service.Impl;

import com.zdw.Bean.User;
import com.zdw.Mapper.UserMapper;
import com.zdw.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    /*
    * 查询用户是否存在
    * */
    @Autowired
    UserMapper userMapper;
    @Override
    public int userSelect(User user) {
        if(userMapper.userSelect(user)==null)
        {
            return 0;
        }
        else{
        return 1;
        }
    }
/*
* 注册事件
* */
    @Override
    public int reName(User user) {
        User user1 = userMapper.reName(user);
        if (user1 != null) {
            return 4;
        } else {
            userMapper.addUser(user);
            return 1;
        }
    }
}
