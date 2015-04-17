package com.xinux.mavenDemo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xinux.mavenDemo.model.User;
import com.xinux.mavenDemo.service.UserService;

/**
 * User 控制器
 * 
 * @author hanlin.xx
 * @version $Id: UserController.java, v 0.1 2015-4-9 下午3:10:17 hanlin.xx Exp $
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/showUser")
    public ModelAndView showUser(HttpServletRequest request) {
        long userId = Long.parseLong(request.getParameter("id"));
        System.out.println(userId);
        User user = userService.getUserById(userId);
        System.out.println(user);
        return new ModelAndView("showUser", "user", user);
    }

    @RequestMapping(value = "/list")
    public ModelAndView showAllUsers() {
        List<User> users = userService.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }

        return new ModelAndView("listUsers", "users", users);
    }

}
