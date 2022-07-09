package com.zdw.Mapper;

import com.zdw.Bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    //登陆是否相同
    User userSelect(User user);
    //注册名字是否相同
    User reName(User user);
    void addUser(User user);
}
