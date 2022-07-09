package com.zdw.Service;

import com.zdw.Bean.User;

public interface UserService {
    //登陆是否相同
    int userSelect(User user);
    //注册名字是否相同
    int reName(User user);

}

