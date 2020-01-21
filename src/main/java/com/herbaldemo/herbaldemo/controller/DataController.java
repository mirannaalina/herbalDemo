package com.herbaldemo.herbaldemo.controller;


import com.herbaldemo.herbaldemo.model.Data;
import com.herbaldemo.herbaldemo.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@Controller
@RequestMapping(value="/herbal")
public class DataController {

    private DataService dataService;

    @Autowired
    protected DataController(DataService dataService){
        this.dataService=dataService;
    }

    @GetMapping("/userdata/{id}")
    @PreAuthorize("hasRole('ROLE_USER'")
    public String getUserData(Model model){
        List<Data> date =this.dataService.getAllData();
        model.addAttribute("date",date);
        return "date.html";
    }



}
