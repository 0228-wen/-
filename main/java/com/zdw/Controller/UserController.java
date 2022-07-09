package com.zdw.Controller;

import com.zdw.Bean.User;
import com.zdw.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    //判断登陆
    @RequestMapping("/userlogin")
    public int userSelect(@RequestBody User user)
    {
        return userService.userSelect(user);
    }
    //判断注册
    @RequestMapping("/rename")
    public int reName(@RequestBody User user)
    {
        return userService.reName(user);
    }

}
