package com.zf.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zf.pojo.Detail;
import com.zf.pojo.User;
import com.zf.service.DetailService;
import com.zf.service.UserService;
import com.zf.utils.GetJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

     @Qualifier("userServiceImpl")
    @Autowired
    private UserService userService;

           @Autowired
           @Qualifier("detailServiceImpl")
    private DetailService detailService;


      @RequestMapping("/allUser")
     public String getAllUser() throws JsonProcessingException {

          ObjectMapper objectMapper = new ObjectMapper();
          String s = objectMapper.writeValueAsString(userService.getAllUser());
          System.out.println(s);

          return s;
     }

        @RequestMapping("/lid")
     public String getLastedId() throws JsonProcessingException {
            int lastestId = detailService.getLastestId();
            return GetJson.getJson(lastestId);
        }





    //    TODO


      @RequestMapping("/addUser")
     public String addUser(User user, Model model,HttpSession session){

          List<User> allUser = userService.getAllUser();
          for (User user1 : allUser) {
              if(user1.getUsername().equals(user.getUsername())){
                  model.addAttribute("msg","repetitive username");
                  return "signup";
              }
          }

          detailService.addDetail(new Detail());
          int lastestId = detailService.getLastestId();
          user.setDetailId(lastestId);

          System.out.println(user);
          userService.addUser(user);

          User userByName = userService.getUserByName(user.getUsername());

          int id = userByName.getId();

          model.addAttribute("userName","hello"+user.getUsername());
          model.addAttribute("userId",id);
          session.setAttribute("userId", id);
          session.setAttribute("userName", user.getUsername());

          System.out.println("aklsdjlkasjdklajsdlkajslkdasd"+session.getAttribute("userName"));


          return "main";

     }

     @RequestMapping("/deleteUser")
    public String deleteUser(int id){
          userService.deleteUser(id);
          return "success";
    }


    @RequestMapping("/getUser/{id}")
    public String getUserById(@PathVariable int id) throws JsonProcessingException {
        User userById = userService.getUserById(id);
        System.out.println(userById);
        return GetJson.getJson(userById);

    }



}
