package com.zf.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {


    // 处理前
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if(request.getRequestURI().contains("toLogin")){
          return true;
        }

        if(request.getRequestURI().contains("login")){
            return true;
        }
        if(request.getRequestURI().contains("signUp")){
            return true;
        }
        if(request.getRequestURI().contains("addUser")){
            return true;
        }

        HttpSession session = request.getSession();

        if(session.getAttribute("userID")!= null){
            return true;

        }
        if(session.getAttribute("userName")!= null){
            return true;
        }


        request.setAttribute("pleaseLogin","你还没有登陆请登录后在尝试");
        request.getRequestDispatcher("index.jsp").forward(request,response);
        return false;

    }





}
