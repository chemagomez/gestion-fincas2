package com.mkyong.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PublicController {

    
    @GetMapping("/public/index")
    public String index() {
        return "/public/index";
    }    

}
