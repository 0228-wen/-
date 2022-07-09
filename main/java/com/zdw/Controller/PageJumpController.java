package com.zdw.Controller;

import com.zdw.Bean.User;
import com.zdw.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//需要用一个专门处理页面跳转的类

@Controller
public class PageJumpController {
    @Autowired
    UserService userService;
    @RequestMapping("/register")
    public String userSelect()
    {
        return "register";
    }
    @RequestMapping("/zhuye")
    public String main()
    {
        return "zhuye";
    }
    @RequestMapping("/index")
    public String index()
    {
        return "index";
    }
}
