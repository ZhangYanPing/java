package com.manong.controller;

import com.manong.pojo.User;
import com.manong.service.UserService;
import com.manong.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/{userid}")
    @ResponseBody
    public User getUserById(@PathVariable Integer userid){
       return userService.getUserById(userid);
    }

    @RequestMapping("/user/pk/{userid}")
    @ResponseBody
    public User getUserByPK(@PathVariable Integer userid){
        return userService.getUserByPrimaryKey(userid);
    }
}
