package com.iqmsoft.boot.gsp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.iqmsoft.boot.gsp.repos.AdminRepository;
import com.iqmsoft.boot.gsp.service.WordzService;

@Controller
public class HomeController {
	
	@Autowired
	private AdminRepository arepos;
	
	@Autowired
	private WordzService s;
	
	
    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("name","Spring Boot GSP MongoDB");
        model.addAttribute("numb", arepos.count());
        model.addAttribute("users", arepos.findAll());
        model.addAttribute("dversion", s.version());
        model.addAttribute("dname", s.name());
        
        return "index";
    }
}
