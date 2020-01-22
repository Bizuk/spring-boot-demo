package com.github.bizuk.casestudy.controller;

import com.github.bizuk.casestudy.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController {
    private UserServices userServices;

    @Autowired
    public UserController(UserServices services){
        this.userServices = services;
    }

    @RequestMapping("/")
        public ModelAndView home(UserController user){
            ModelAndView mv = new ModelAndView();
            mv.addObject(  "obj", user);
            mv.setViewName("home");
            return mv;
    }
}
