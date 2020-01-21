package com.herbaldemo.herbaldemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value="/herbal")
public class LoginController {

    @GetMapping(value={"/welcome"})
    public String welcomePage(Model model){
        model.addAttribute("title","Welcome!");
        model.addAttribute("message","Herbalife website");
        return "welcomePage.html";
    }

    @GetMapping(value="/login")
    public String loginPage(Model model){
        return "loginPage.html";
    }

    @GetMapping(value="/logoutDone")
    public String logoutPage(Model model){
        return "logoutPage.html";
    }


}
