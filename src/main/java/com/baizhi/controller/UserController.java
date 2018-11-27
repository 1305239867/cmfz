package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(HttpSession session, User user, String kaptcha) {
        String sessionkaptcha = (String) session.getAttribute("kaptcha");
        System.out.println(sessionkaptcha + "*********************");
        System.out.println(user + "******************************");
        user = userService.login(user);
        if (user != null && sessionkaptcha.equalsIgnoreCase(kaptcha)) {
            session.setAttribute("user", user);
            return "redirect:/main/main.jsp";
        } else {
            return "login.jsp";
        }
    }
}
