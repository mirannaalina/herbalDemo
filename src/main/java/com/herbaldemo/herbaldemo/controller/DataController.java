package com.herbaldemo.herbaldemo.controller;


import com.herbaldemo.herbaldemo.model.Data;
import com.herbaldemo.herbaldemo.model.DataEntity;
import com.herbaldemo.herbaldemo.model.DataModel;
import com.herbaldemo.herbaldemo.service.DataService;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping(value="/herbal")
public class DataController {

    private DataService dataService;

    @Autowired
    protected DataController(DataService dataService) {
        this.dataService = dataService;
    }

    //get all data output
    @GetMapping("/userdata/{id}")
    @PreAuthorize("hasRole('ROLE_USER'")
    public String getUserData(Model model) {
        List<DataEntity> date = this.dataService.getAllData();
        model.addAttribute("date", date);
        return "date.html";
    }

    //new dates to save in db
    //after pressing the button, new data will be added, ready to be compared.
    @PostMapping("/userdata/add")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String save(Model model,@PathVariable Long id, @ModelAttribute DataModel dataModel) {
        dataService.newEntry(dataModel);

       // model.addAttribute("data",date);  ??
        model.addAttribute("dataModel", new DataModel());

        return "adddate.html"; //updated with our new entries
}

}