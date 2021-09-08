package com.zf.controller;


import com.zf.pojo.User;
import com.zf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes(value = {"userId", "userName"})
public class LoginController {

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;



    @RequestMapping("/signUp")
    public String tologin(){
            return "signup";
    }


    @RequestMapping("/tologin")
    public String toLogin(){

        return "login";
    }


    @RequestMapping("/login")
    public String login(HttpSession httpSession, String username, String pwd, Model model){

        User user = userService.getUserByName(username);
        if(user!=null && user.getPwd().equals(pwd)){

            httpSession.setAttribute("userId", user.getId());
            model.addAttribute("userId",user.getId());
            httpSession.setAttribute("userName", username);
            model.addAttribute("userName", username);
            return "main";

        }else {
             model.addAttribute("err","用户名或者密码错误");
            return "login";

        }

    }



}
