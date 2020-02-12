package com.herbaldemo.herbaldemo.controller;

import com.herbaldemo.herbaldemo.model.UserEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class RegistrationController {

    //implementation in progress...

    @GetMapping("/registration")
    public String showRegistrationForm(Model model){
        UserEntity userEntity =  new UserEntity();
        model.addAttribute("user",userEntity);
        return "registrationPage.html";
    }
}
