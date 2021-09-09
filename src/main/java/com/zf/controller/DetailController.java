package com.zf.controller;

import com.zf.pojo.Detail;
import com.zf.pojo.User;
import com.zf.service.DetailService;
import com.zf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class DetailController {

    @Autowired
    @Qualifier("detailServiceImpl")
    private DetailService detailService;

    @Autowired
    @Qualifier("userServiceImpl")
    private UserService userService;



    @RequestMapping("/toUpdateDetail")
    public String toUpdateDetail(Model model,HttpSession session){
        Integer userId = (Integer) session.getAttribute("userId");

        User userById = userService.getUserById(userId);
        int detailId = userById.getDetailId();

        Detail detailById = detailService.getDetailById(detailId);
        model.addAttribute("detail", detailById);
        return "detail";
    }



    @RequestMapping("/updateDetail")
    public String updateDetail(HttpSession session,Detail detail,Model model){

        Integer userId = (Integer) session.getAttribute("userId");

        User userById = userService.getUserById(userId);
        int detailId = userById.getDetailId();

        detail.setId(detailId);



        detailService.updateDetailByuserId(detail);

           model.addAttribute("successOfProfile", "update profile successfully");



        return "main";
    }




}
